package com.robototes.logging.shuffleboard.reporters.abst;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.IReporter;
import com.robototes.logging.shuffleboard.ShuffleBoardManager;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;

/**
 * This is a template class for all the number widgets
 * 
 * @author Eli Orona
 *
 * @param <S> The type of the widget
 */
@SuppressWarnings("unchecked")
public abstract class NumberReporter<S extends NumberReporter<S>> implements IReporter<Double, S> {

	private final Supplier<Double> getter;
	private final String name;
	private final String tabName;

	private boolean built = false;
	private Map<String, Object> allProperties;
	private SimpleWidget widget;

	protected NetworkTableEntry entry;

	/**
	 * Creates a new {@link NumberReporter}
	 * 
	 * @param getter  The data supplier
	 * @param setter  The data user
	 * @param name    The name of the widget
	 * @param tabName The tab for the widget
	 */
	public NumberReporter(Supplier<Double> getter, String name, String tabName) {
		this.getter = getter;
		this.name = name;
		this.tabName = tabName;

		widget = Shuffleboard.getTab(getTabName()).add(getName(), getter).withWidget(getType());
	}

	@Override
	public Supplier<Double> getReporter() {
		return getter;
	}

	/**
	 * Initializes this against {@link ShuffleBoardManager}
	 */
	public void initializeWidget() {
		ShuffleBoardManager.getInstance().add(this);
		entry = widget.withProperties(allProperties).getEntry();
		pastGet = getter.get();
	}

	private double pastGet;

	@Override
	public void update() {
		double value = entry.getDouble(Double.NaN);

		if (value == pastGet) {
			double newValue = getter.get();
			entry.setDouble(newValue);
			pastGet = newValue;
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getTabName() {
		return tabName;
	}

	@Override
	public S withSize(int width, int height) {
		checkNotBuilt();
		widget.withSize(width, height);
		return (S) this;
	}

	@Override
	public S withPosition(int columnIndex, int rowIndex) {
		checkNotBuilt();
		widget.withPosition(columnIndex, rowIndex);
		return (S) this;
	}

	@Override
	public S withProperties(Map<String, Object> properties) {
		checkNotBuilt();
		if (this.allProperties == null) {
			allProperties = properties;
		} else {
			allProperties.putAll(properties);
		}
		return (S) this;
	}

	@Override
	public S build() {
		checkNotBuilt();
		initializeWidget();
		built = true;
		return (S) this;
	}

	@Override
	public boolean hasBeenBuilt() {
		return built;
	}

}
