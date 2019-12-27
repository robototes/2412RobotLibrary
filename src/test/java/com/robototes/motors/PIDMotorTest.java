package com.robototes.motors;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Test;
import com.robototes.PIDControls.PIDConstants;
import com.robototes.math.MathUtils;
import com.robototes.motors.MotorRotations.SparkMaxRotations;

public class PIDMotorTest {

	static {
		System.loadLibrary("ntcorejni");
	}

	@Test
	public void testPIDMotor() {
		PIDConstants constants = new PIDConstants(1);
		PIDMotor<SparkMaxRotations> motor = new PIDMotor<SparkMaxRotations>(new SparkMaxRotations(0), constants);

		double testMotorSetSpeed = 1;
		motor.setSpeed(testMotorSetSpeed);
		assertEquals("Motor has correct speed", testMotorSetSpeed, motor.getSpeed(), MathUtils.EPSILON);
	}

}
