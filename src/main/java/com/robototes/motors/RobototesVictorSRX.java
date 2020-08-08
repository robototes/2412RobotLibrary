package com.robototes.motors;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class RobototesVictorSRX extends WPI_VictorSPX implements Motor {

	public RobototesVictorSRX(int deviceNumber) {
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
