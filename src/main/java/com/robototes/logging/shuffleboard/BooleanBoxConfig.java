package com.robototes.logging.shuffleboard;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public class BooleanBoxConfig extends BooleanConfig<BooleanBoxConfig> {

	public BooleanBoxConfig(Supplier<Boolean> getter, Consumer<Boolean> setter, String name, String tabName) {
		super(getter, setter, name, tabName);
	}


	public WidgetType getType() {
		return BuiltInWidgets.kBooleanBox;
	}
	
	public BooleanBoxConfig withColors(String falseColor, String trueColor) {
		return this.withProperties(Map.of("colorWhenFalse", falseColor, "colorWhenTrue", trueColor));
	}

}
