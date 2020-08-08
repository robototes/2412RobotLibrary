package com.robototes.motors;

public interface Motor {

	public void set(double speed);

	public double get();

	public void setInverted(boolean inverted);

	public boolean getInverted();

	public void setP(double value);

	public void setI(double value);

	public void setD(double value);

	public void setF(double value);

}
