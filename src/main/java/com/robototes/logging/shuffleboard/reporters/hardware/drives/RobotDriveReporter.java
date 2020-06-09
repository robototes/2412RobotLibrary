package com.robototes.logging.shuffleboard.reporters.hardware.drives;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.IReporter;

import edu.wpi.first.wpilibj.drive.RobotDriveBase;

public abstract class RobotDriveReporter<T extends RobotDriveBase, S extends RobotDriveReporter<T, S>>
		implements IReporter<T, S> {

	@Override
	public Supplier<T> getReporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTabName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S withSize(int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S withPosition(int columnIndex, int rowIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S withProperties(Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S build() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasBeenBuilt() {
		// TODO Auto-generated method stub
		return false;
	}

}
