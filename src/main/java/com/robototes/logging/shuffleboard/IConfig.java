package com.robototes.logging.shuffleboard;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface IConfig<T> {
	public DisplayWidgetType getType();

	public Supplier<T> getGetter();

	public Consumer<T> getSetter();
}
