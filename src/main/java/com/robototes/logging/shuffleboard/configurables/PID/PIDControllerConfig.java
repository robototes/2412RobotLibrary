package com.robototes.logging.shuffleboard.configurables.PID;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * PID Controller widget
 *
 * @author Eli Orona
 *
 */
public class PIDControllerConfig extends AbstractReporter<PIDController, PIDControllerConfig> {

	/**
	 * Creates a PID Controller widget
	 *
	 * @param controller PID Controller
	 * @param name       Widget name
	 * @param tabName    Tab name
	 */
	public PIDControllerConfig(PIDController controller, String name, String tabName) {
		super(() -> controller, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kPIDController;
	}

	@Override
	public void update() {
	}

}
