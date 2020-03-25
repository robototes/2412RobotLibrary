package com.robototes.subsystemsInterfaces;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum DoubleSolenoidState {
	
	EXTEND(DoubleSolenoid.Value.kForward),

	WITHDRAW(DoubleSolenoid.Value.kReverse),
	
	OFF(DoubleSolenoid.Value.kOff);

	public DoubleSolenoid.Value value;

	private DoubleSolenoidState(DoubleSolenoid.Value value) {
		this.value = value;
	}

}


