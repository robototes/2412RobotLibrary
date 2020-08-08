package com.robototes.motors;

import com.revrobotics.CANSparkMax;

public class RobototesCANSparkMax extends CANSparkMax implements Motor {

	public RobototesCANSparkMax(int deviceID, MotorType type) {
		super(deviceID, type);
	}

	@Override
	public void setP(double value) {
		super.getPIDController().setP(value);
	}

	@Override
	public void setI(double value) {
		super.getPIDController().setI(value);
	}

	@Override
	public void setD(double value) {
		super.getPIDController().setD(value);
	}

	@Override
	public void setF(double value) {
		super.getPIDController().setFF(value);
	}

}
