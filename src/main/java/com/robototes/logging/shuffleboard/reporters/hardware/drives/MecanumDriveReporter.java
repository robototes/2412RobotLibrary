package com.robototes.logging.shuffleboard.reporters.hardware.drives;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A Mecanum Drive Widget
 *
 * @author Eli Orona
 *
 */
public class MecanumDriveReporter extends RobotDriveReporter<MecanumDrive, MecanumDriveReporter> {

	/**
	 * Creates a new Mecanum Drive widget
	 *
	 * @param getter  The drive supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public MecanumDriveReporter(MecanumDrive drive, String name, String tabName) {
		super(() -> drive, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kMecanumDrive;
	}

}
