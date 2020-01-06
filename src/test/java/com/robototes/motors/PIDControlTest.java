package com.robototes.motors;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import com.robototes.helpers.MockHardwareExtension;

import com.robototes.PIDControls.PIDConstants;
import com.robototes.control.DistanceSubsystem;
import com.robototes.helpers.TestWithScheduler;
import com.robototes.math.MathUtils;
import com.robototes.motors.MotorRotations.SparkMaxRotations;
import com.robototes.units.Distance;
import com.robototes.units.InterUnitRatio;
import com.robototes.units.UnitTypes.DistanceUnits;
import com.robototes.units.UnitTypes.RotationUnits;

@SuppressWarnings("unused")
public class PIDControlTest extends TestWithScheduler {

	static {
		System.loadLibrary("ntcorejni");
	}

	@Before
	public void setupTest() {
		MockHardwareExtension.beforeAll();
		schedulerStart();
	}

	@Test
	public void testPIDMotor() {
		PIDConstants constants = new PIDConstants(1);
		PIDMotor<SparkMaxRotations> motor = new PIDMotor<SparkMaxRotations>(new SparkMaxRotations(0), constants);

		double testMotorSetSpeed = 1;
		motor.setSpeed(testMotorSetSpeed);
		assertEquals("Motor has correct speed", testMotorSetSpeed, motor.getSpeed(), MathUtils.EPSILON);
	}

	@Test
	public void testPIDDistanceSubsystem() {

		InterUnitRatio<RotationUnits, DistanceUnits> distanceSubsystemRatio = new InterUnitRatio<RotationUnits, DistanceUnits>(
				RotationUnits.ROTATION, 1, DistanceUnits.METER);

		PIDConstants constants = new PIDConstants(1);

		PIDMotor<?>[] motors = new PIDMotor[] { new PIDMotor<SparkMaxRotations>(new SparkMaxRotations(0), constants) };

		DistanceSubsystem distanceSubsystem = new DistanceSubsystem(motors, distanceSubsystemRatio);

//		distanceSubsystem.setReference(new Distance(1)); //Currently broken, skipping for now

	}

}
