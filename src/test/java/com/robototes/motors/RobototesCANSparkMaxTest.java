package com.robototes.motors;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.robototes.math.MathUtils;

public class RobototesCANSparkMaxTest {

	@Test
	public void testMotorSetsCorrectSpeeds() {
		RobototesCANSparkMax testMotor = new RobototesCANSparkMax(0, MotorType.kBrushless, true);

		double setValue = 1;
		testMotor.set(setValue);
		assertEquals("Motor has correct set speed: 1", setValue, testMotor.get(), MathUtils.EPSILON);

		setValue = 0;
		testMotor.set(setValue);
		assertEquals("Motor has correct set speed: 0", setValue, testMotor.get(), MathUtils.EPSILON);

		testMotor.close();
	}

}
