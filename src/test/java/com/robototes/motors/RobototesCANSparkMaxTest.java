package com.robototes.motors;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.robototes.math.MathUtils;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobototesCANSparkMaxTest {
	RobototesCANSparkMaxSIM testMotor;
	private static int motorID = 0;

	@Before
	public void before() {
		testMotor = new RobototesCANSparkMaxSIM(motorID, MotorType.kBrushless, true);
		motorID++;
	}

	@Test
	public void testMotorSetsCorrectSpeeds() {
		double setValue = 1;
		testMotor.set(setValue);
		assertSpeed("Motor has correct set speed: 1", setValue);

		setValue = 0;
		testMotor.set(setValue);
		assertSpeed("Motor has correct set speed: 0", setValue);
	}

	@Test
	public void motorWorksWithBasicCommands() {
		Command instant = new InstantCommand(() -> testMotor.set(1));
		instant.initialize();

		assertSpeed("Motor has correct set speed from command: 1", 1);

		instant = new InstantCommand(() -> testMotor.set(0));
		instant.initialize();

		assertSpeed("Motor has correct set speed from command: 0", 0);
	}

	@After
	public void after() {
		testMotor.close();
	}

	public void assertSpeed(String testName, double speed) {
		assertEquals(testName, speed, testMotor.get(), MathUtils.EPSILON);
	}

}
