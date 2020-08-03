package com.robototes.logging.shuffleboard;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * A template for all value configurables (Double, String, etc.)
 *
 * @author Eli Orona
 *
 * @param <T> The type of the data
 * @param <S> Self
 */
public abstract class AbstractValueConfigurable<T, S extends AbstractValueConfigurable<T, S>>
		extends AbstractReporter<T, S> implements IConfigurable<T, S> {

	/**
	 * The setter for the widget
	 */
	protected Consumer<T> setter;

	/**
	 *
	 * @param getter  The supplier of data
	 * @param setter  The user of the data
	 * @param name    The name of the widget
	 * @param tabName The tab of the widget
	 */
	public AbstractValueConfigurable(Supplier<T> getter, Consumer<T> setter, String name, String tabName) {
		super(getter, name, tabName);
		this.setter = setter;
	}

	@Override
	public Consumer<T> getSetter() {
		return setter;
	}

}
