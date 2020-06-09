package com.robototes.logging.shuffleboard.configurables.abst;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.IConfigurable;
import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;

/**
 * This is a template class for all the number widgets
 * 
 * @author Eli Orona
 *
 * @param <S> The type of the widget
 */
public abstract class NumberConfig<S extends NumberConfig<S>> extends NumberReporter<S>
		implements IConfigurable<Double, S> {

	private final Consumer<Double> setter;

	/**
	 * Creates a new {@link NumberConfig}
	 * 
	 * @param getter  The data supplier
	 * @param setter  The data user
	 * @param name    The name of the widget
	 * @param tabName The tab for the widget
	 */
	public NumberConfig(Supplier<Double> getter, Consumer<Double> setter, String name, String tabName) {
		super(getter, name, tabName);
		this.setter = setter;
	}

	@Override
	public Consumer<Double> getSetter() {
		return setter;
	}

	private double pastGet;

	@Override
	public void update() {
		double value = entry.getDouble(Double.NaN);

		if (value == pastGet) {
			super.update();
		} else if (value != Double.NaN) {
			setter.accept(value);
		}
	}

}
