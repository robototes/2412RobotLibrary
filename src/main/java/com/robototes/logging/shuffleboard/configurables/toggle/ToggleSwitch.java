package com.robototes.logging.shuffleboard.configurables.toggle;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.configurables.abst.BooleanConfig;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * Toggle switch widget
 *
 * @author Eli Orona
 *
 */
public class ToggleSwitch extends BooleanConfig<ToggleSwitch> {

	/**
	 * Creates a Toggle Switch widget
	 *
	 * @param getter  Supplier for the widget
	 * @param setter  Consumer of the widget
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public ToggleSwitch(Supplier<Boolean> getter, Consumer<Boolean> setter, String name, String tabName) {
		super(getter, setter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kToggleSwitch;
	}

}
