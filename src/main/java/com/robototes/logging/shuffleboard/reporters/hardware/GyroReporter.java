package com.robototes.logging.shuffleboard.reporters.hardware;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A gyro widget
 *
 * @author Eli Orona
 *
 */
public class GyroReporter extends AbstractReporter<Gyro, GyroReporter> {

	/**
	 * Creates a new Gyro widget
	 *
	 * @param gyro    The gryo
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public GyroReporter(Gyro gyro, String name, String tabName) {
		super(() -> gyro, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kGyro;
	}

	/**
	 * Shows the tick ring
	 *
	 * @param show Show the ring
	 * @return this
	 */
	public GyroReporter showTickMarks(boolean show) {
		return withProperties(Map.of("showTickMarkRing", show));
	}

	/**
	 * Sets the starting angle of the widget
	 *
	 * @param angle The angle
	 * @return this
	 */
	public GyroReporter startingAngle(double angle) {
		return withProperties(Map.of("startingAngle", angle));
	}

	@Override
	public void update() {
	}

	/**
	 * Sets the major tick spacing
	 *
	 * @param spacing Tick spacing
	 * @return this
	 */
	public GyroReporter withTickSpacing(int spacing) {
		return withProperties(Map.of("majorTickSpacing", spacing));
	}

}
