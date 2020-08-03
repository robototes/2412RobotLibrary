package com.robototes.logging.shuffleboard.reporters.hardware.drives;

import java.util.Map;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A Differential Drive Widget
 *
 * @author Eli Orona
 *
 */
public class DifferentialDriveReporter extends RobotDriveReporter<DifferentialDrive, DifferentialDriveReporter> {

	/**
	 * Creates a new Differential Drive widget
	 *
	 * @param getter  The drive supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public DifferentialDriveReporter(DifferentialDrive drive, String name, String tabName) {
		super(() -> drive, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kDifferentialDrive;
	}

	/**
	 * Set wheel diameter
	 *
	 * @param wheelDiameter Wheel diameter
	 * @return this
	 */
	public DifferentialDriveReporter withWheelDiameter(int wheelDiameter) {
		return withProperties(Map.of("wheelDiameter", wheelDiameter));
	}

	/**
	 * Set the number of wheels
	 *
	 * @param wheels number of wheels
	 * @return this
	 */
	public DifferentialDriveReporter withWheels(int wheels) {
		if (wheels < 0) {
			throw new IllegalArgumentException("Wheels cannot be negative");
		}
		return withProperties(Map.of("numberOfWheels", wheels));
	}

}
