package com.robototes.logging.shuffleboard.reporters.hardware.drives;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.drive.RobotDriveBase;

/**
 * An abstract impl for {@link RobotDriveBase}
 *
 * @author Eli Orona
 *
 * @param <T> Robot Drive Type
 * @param <S> Self
 */
public abstract class RobotDriveReporter<T extends RobotDriveBase, S extends RobotDriveReporter<T, S>>
		extends AbstractReporter<T, S> {

	/**
	 * Creates a new Robot Drive widget
	 *
	 * @param getter  The drive supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public RobotDriveReporter(Supplier<T> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	/**
	 * Show the velocity vectors
	 *
	 * @param show Show vectors
	 * @return this
	 */
	public S showVectors(boolean show) {
		return withProperties(Map.of("showVectors", show));
	}

	@Override
	public void update() {

	}

}
