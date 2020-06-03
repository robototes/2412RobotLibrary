package com.robototes.logging.shuffleboard;

public class ExampleCode {
	SliderConfig speedConfig = new SliderConfig(this::getSpeed, this::setSpeed, "Speed configuration",
			"My subsystem idea").withPosition(1, 1).withSize(2, 1).withMinMax(-1, 1).build();

	double speed = 0;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}