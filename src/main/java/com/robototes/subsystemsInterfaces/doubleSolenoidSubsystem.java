package com.robototes.subsystemsInterfaces;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public interface doubleSolenoidSubsystem {
	
	public DoubleSolenoid m_solenoid = null;
	
	public DoubleSolenoidState m_state = DoubleSolenoidState.OFF;

	public void set(DoubleSolenoidState value);

	public void extend();

	public void withdraw();

	public void off();
	
	public DoubleSolenoidState getState();


}
