package com.robototes.motors;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobototesTalonSRX extends WPI_TalonSRX implements Motor {

	public RobototesTalonSRX(int deviceNumber) {
		super(deviceNumber);
	}

	@Override
	public void setP(double value) {
		super.config_kP(0, value);
	}

	@Override
	public void setI(double value) {
		super.config_kI(0, value);
	}

	@Override
	public void setD(double value) {
		super.config_kD(0, value);
	}

	@Override
	public void setF(double value) {
		super.config_kF(0, value);
	}

}
