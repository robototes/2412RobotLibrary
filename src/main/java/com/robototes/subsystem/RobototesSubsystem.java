package com.robototes.subsystem;

/**
 *
 * @author Eli Orona
 *
 */
public interface RobototesSubsystem {
	/**
	 *
	 * @author Eli Orona
	 *
	 */
	public enum SubsystemType {
		ARM, CLIMB, DRIVEBASE, INTAKE, LIFT, OTHER, SHIFTER, SHOOTER, TURRET, VISION;
	}

	/**
	 *
	 * @return The name of the subsystem
	 */
	public String getRobototesName();

	/**
	 *
	 * @return The type of subsystem
	 */
	public SubsystemType getSubsystemType();
}
