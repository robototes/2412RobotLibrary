package com.robototes.logging.shuffleboard;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SliderConfig implements IConfig<Double> {

	Supplier<Double> getter;
	Consumer<Double> setter;

	public SliderConfig(Supplier<Double> getter, Consumer<Double> setter) {
		this.getter = getter;
		this.setter = setter;
	}

	@Override
	public DisplayWidgetType getType() {
		return DisplayWidgetType.SLIDER;
	}

	@Override
	public Supplier<Double> getGetter() {
		return getter;
	}

	@Override
	public Consumer<Double> getSetter() {
		return setter;
	}

}