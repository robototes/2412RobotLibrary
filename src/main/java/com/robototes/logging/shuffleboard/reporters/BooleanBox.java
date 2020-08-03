package com.robototes.logging.shuffleboard.reporters;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.reporters.abst.BooleanReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A boolean box widget
 *
 * @author Eli Orona
 *
 */
public class BooleanBox extends BooleanReporter<BooleanBox> {

	/**
	 * Creates a new Boolean Box widget
	 *
	 * @param getter  The boolean supplier
	 * @param name    The name of the widget
	 * @param tabName The tab name
	 */
	public BooleanBox(Supplier<Boolean> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kBooleanBox;
	}

	/**
	 * Sets the colors of the widget
	 *
	 * @param falseColor Color when false
	 * @param trueColor  Color when true
	 * @return this
	 */
	public BooleanBox withColors(String falseColor, String trueColor) {
		return withProperties(Map.of("colorWhenFalse", falseColor, "colorWhenTrue", trueColor));
	}

}
