package com.robototes.subsystemsInterfaces;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;

public interface CANSubsystem {

	public CANSparkMax m_motor = null;
	public CANEncoder m_encoder = null;
	public CANPIDController m_pidController = null;

	public void setSpeed(double val);

	public void forward();

	public void backward();

	public void off();

	public void setP(double gain);

	public double getWheelRevolutions();
	
	public double getCurrentDraw();

}
