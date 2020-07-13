package com.robototes.logging.shuffleboard.reporters.hardware.drives;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public class MecanumDriveReporter extends RobotDriveReporter<MecanumDrive, MecanumDriveReporter> {

	public MecanumDriveReporter(Supplier<MecanumDrive> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kMecanumDrive;
	}

}
