package com.robototes.logging.shuffleboard.reporters.number;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A number bar widget
 *
 * @author Eli Orona
 *
 */
public class NumberBar extends NumberReporter<NumberBar> {

	/**
	 * Creates a new number bar
	 *
	 * @param getter  Value supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public NumberBar(Supplier<Double> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kNumberBar;
	}

	/**
	 * Sets the center of the bar
	 *
	 * @param center The center of the bar
	 * @return this
	 */
	public NumberBar withCenter(double center) {
		return withProperties(Map.of("center", center));
	}

}
