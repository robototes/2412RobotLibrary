package com.robototes.subsystemsInterfaces;

public interface talonSubsystem {

	public void setSpeed(double val);

	public void forward();

	public void backward();

	public void off();

	public void setPID(double gain);

	public double getWheelRevolutions();
	
	public double getCurrentDraw();

}
