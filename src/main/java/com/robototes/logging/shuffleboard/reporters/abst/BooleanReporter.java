package com.robototes.logging.shuffleboard.reporters.abst;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.IReporter;
import com.robototes.logging.shuffleboard.ShuffleBoardManager;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;

@SuppressWarnings("unchecked")
public abstract class BooleanReporter<S extends BooleanReporter<S>> implements IReporter<Boolean, S> {

	private final Supplier<Boolean> getter;
	private final String name;
	private final String tabName;

	private boolean built = false;
	private Map<String, Object> allProperties;
	private SimpleWidget widget;

	private boolean oldValue;

	private NetworkTableEntry entry;

	public BooleanReporter(Supplier<Boolean> getter, String name, String tabName) {
		this.getter = getter;
		this.name = name;
		this.tabName = tabName;

		widget = Shuffleboard.getTab(getTabName()).add(getName(), getter).withWidget(getType());
	}

	@Override
	public Supplier<Boolean> getReporter() {
		return getter;
	}

	public void initializeWidget() {
		ShuffleBoardManager.getInstance().add(this);
		entry = widget.withProperties(allProperties).getEntry();
		oldValue = getter.get();
	}

	@Override
	public void update() {
		Boolean value = entry.getBoolean(false); // Get the value of the shuffleboard widget

		if (value == oldValue) { // if it's the same to what it was last update
			boolean newValue = getter.get(); // get the object's value (object == whatever you have the thing set to)
			entry.setBoolean(newValue); // Set the widgets value to the object's value i.e. update the widget
			oldValue = newValue;
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
