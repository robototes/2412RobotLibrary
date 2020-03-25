package com.robototes.subsystemsInterfaces;

import edu.wpi.first.wpilibj.Solenoid;

public interface solenoidSubsystem {
	
	public Solenoid m_solenoid = null;

	public void extend();

	public void withdraw();
	
	public boolean get();

}
