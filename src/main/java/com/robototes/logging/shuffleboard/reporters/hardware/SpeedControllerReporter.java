package com.robototes.logging.shuffleboard.reporters.hardware;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A speed controller widget
 *
 * @author Eli Orona
 *
 */
public class SpeedControllerReporter extends AbstractReporter<SpeedController, SpeedControllerReporter> {

	/**
	 * Creates a speed controller widget
	 *
	 * @param controller The speed controller
	 * @param name       Widget name
	 * @param tabName    Tab name
	 */
	public SpeedControllerReporter(SpeedController controller, String name, String tabName) {
		super(() -> controller, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kSpeedController;
	}

	@Override
	public void update() {
	}

	/**
	 * Sets the orientation of the widget
	 *
	 * @param orientation Orientation of the widget
	 * @return this
	 */
	public SpeedControllerReporter withOrientation(Oritentation orientation) {
		return withProperties(Map.of("orientation", orientation.toString()));
	}

}
