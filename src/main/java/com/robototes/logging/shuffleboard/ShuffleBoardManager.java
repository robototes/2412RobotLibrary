package com.robototes.logging.shuffleboard;

public class ShuffleBoardManager {

	// ...
	public void update() {
		IConfig<Double> speedConfig = new SliderConfig(this::getSpeed, this::setSpeed);
	}

	public void setSpeed(double speed) {

	}

	public double getSpeed() {
		return 1;
	}
}
