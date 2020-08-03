package com.robototes.logging.shuffleboard.reporters.number;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A Voltage View widget
 *
 * @author Eli Orona
 *
 */
public class VoltageView extends NumberReporter<VoltageView> {

	/**
	 * Creates a new Voltage View
	 *
	 * @param getter  The voltage supplier
	 * @param name    The widget name
	 * @param tabName The tab name
	 */
	public VoltageView(Supplier<Double> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kVoltageView;
	}

	/**
	 * Sets the center of the bar
	 *
	 * @param center The center of the bar
	 * @return this
	 */
	public VoltageView withCenter(double center) {
		return withProperties(Map.of("center", center));
	}

	/**
	 * Sets the orientation of the widget
	 *
	 * @param orientation Orientation of the widget
	 * @return this
	 */
	public VoltageView withOrientation(Oritentation orientation) {
		return withProperties(Map.of("orientation", orientation.toString()));
	}

	/**
	 * Sets the number of tick marks
	 *
	 * @param tickMarks Tick marks
	 * @return this
	 */
	public VoltageView withTickMarks(int tickMarks) {
		return withProperties(Map.of("tickMarks", tickMarks));
	}

}
