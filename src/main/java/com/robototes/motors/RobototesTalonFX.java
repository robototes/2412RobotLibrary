package com.robototes.motors;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class RobototesTalonFX extends WPI_TalonFX implements Motor {

	public RobototesTalonFX(int channel) {
		super(channel);
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
