package com.robototes.logging.shuffleboard.configurables.PID;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;
import edu.wpi.first.wpilibj2.command.PIDCommand;

/**
 * PID Command Widget
 *
 * @author Eli Orona
 *
 */
public class PIDCommandConfig extends AbstractReporter<PIDCommand, PIDCommandConfig> {

	/**
	 * Creates a PID Command widget
	 *
	 * @param command Command
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public PIDCommandConfig(PIDCommand command, String name, String tabName) {
		super(() -> command, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kPIDCommand;
	}

	@Override
	public void update() {
	}

}
