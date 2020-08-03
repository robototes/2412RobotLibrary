package com.robototes.logging.shuffleboard.configurables.chooser;

import java.util.function.Consumer;

import com.robototes.logging.shuffleboard.configurables.abst.ChooserConfig;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * Split Button Chooser
 *
 * @author Eli Orona
 *
 * @param <T> Type of the chooser
 */
public class SplitButtonChooser<T> extends ChooserConfig<T, SplitButtonChooser<T>> {

	/**
	 * Creates a new Split Button Chooser
	 *
	 * @param sendableChooser The Chooser
	 * @param setter          The consumer of the change
	 * @param name            Widget name
	 * @param tabName         Tab name
	 */
	public SplitButtonChooser(SendableChooser<T> sendableChooser, Consumer<T> setter, String name, String tabName) {
		super(sendableChooser, setter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kSplitButtonChooser;
	}

}
