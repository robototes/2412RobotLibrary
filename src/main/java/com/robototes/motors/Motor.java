package com.robototes.motors;

public interface Motor {
	
	public void set(double speed);
	
	public double get();
	
	public void setInverted(boolean inverted);
	
	public boolean getInverted();
	
	public void setP();
	
	public void setI();
	
	public void setD();
	
	public void setF();

}
