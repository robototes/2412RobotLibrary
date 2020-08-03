package com.robototes.logging.shuffleboard.configurables.abst;

import java.util.function.Consumer;

import com.robototes.logging.shuffleboard.AbstractValueConfigurable;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * Abstract impl for Choosers
 *
 * @author Eli Orona
 *
 * @param <T> Type of the chooser
 * @param <S> Self
 */
public abstract class ChooserConfig<T, S extends ChooserConfig<T, S>>
		extends AbstractValueConfigurable<SendableChooser<T>, S> {

	/**
	 * The chooser
	 */
	protected SendableChooser<T> chooser;

	/**
	 * The old value of the widget
	 */
	protected T oldValue;

	/**
	 * The consumer of the chooser
	 */
	protected Consumer<T> setter;

	/**
	 * Creates a new Chooser
	 *
	 * @param sendableChooser The chooser
	 * @param setter          The consumer of the change
	 * @param name            Widget name
	 * @param tabName         Tab name
	 */
	public ChooserConfig(SendableChooser<T> sendableChooser, Consumer<T> setter, String name, String tabName) {
		super(() -> sendableChooser, null, name, tabName);
		chooser = sendableChooser;
		this.setter = setter;
	}

	@Override
	public void update() {
		T value = chooser.getSelected();

		if (value != oldValue) {
			setter.accept(value);
			oldValue = value;
		}
	}
}
