package com.robototes.subsystem;

/**
 * A simple subsystem that can be turned on and off
 *
 * @author Eli Orona
 *
 */
public interface OnOffSubsystem extends RobototesSubsystem, Invertable {

	/**
	 * Turns off the subsystem
	 */
	public void off();

	/**
	 * Turns on the subsystem
	 */
	public void on();
}
