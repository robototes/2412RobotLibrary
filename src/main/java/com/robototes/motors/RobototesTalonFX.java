package com.robototes.motors;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class RobototesTalonFX extends WPI_TalonFX implements Motor {

	public RobototesTalonFX(int channel) {
		super(channel);
	}

	@Override
	public void set(double speed) {
		super.set(ControlMode.PercentOutput, speed);
	}

	@Override
	public double get() {
		return super.get();
	}

	@Override
	public void setP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setF() {
		// TODO Auto-generated method stub
		
	}
	
	


}
