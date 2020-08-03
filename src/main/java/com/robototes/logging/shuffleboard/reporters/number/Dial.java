package com.robototes.logging.shuffleboard.reporters.number;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A dial widget
 *
 * @author Eli Orona
 *
 */
public class Dial extends NumberReporter<Dial> {

	/**
	 * Creates a new Dial widget
	 *
	 * @param getter  The value supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public Dial(Supplier<Double> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kDial;
	}

	/**
	 * Enables showing the value on the widget
	 *
	 * @param show Show the value
	 * @return this
	 */
	public Dial showValue(boolean show) {
		return withProperties(Map.of("showValue", show));
	}

}
