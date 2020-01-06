package com.robototes.motors;

import com.robototes.units.Rotations;
import com.robototes.units.Time;
import com.robototes.units.UnitTypes.TimeUnits;
import com.robototes.PIDControls.*;

@SuppressWarnings("unchecked")
public class PIDMotor<T extends MotorRotations> implements PIDMotorController<T> {

	private T currentRotationReference;
	private double currentSpeed;

	private T currentRotations;

	private PIDController PIDController;

	public PIDMotor(T currentReference, PIDConstants constants) {
		currentRotationReference = currentReference;
		currentRotations = currentReference;
		PIDController = new PIDController(constants);
		currentSpeed = 0;
	}

	@Override
	public void addRotations(Rotations rotationReference) {
		currentRotationReference = (T) currentRotationReference.add(rotationReference);
	}

	@Override
	public void setRotations(Rotations rotationReference) {
		currentRotationReference = (T) rotationReference;
	}

	@Override
	public void setSpeed(double speed) {
		currentSpeed = speed;
	}

	@Override
	public double usePIDOutput() {
		return usePIDOutput(new Time(50, TimeUnits.MILLISECOND));
	}

	@Override
	public double usePIDOutput(Time timestep) {
		double pidOutput = PIDController.getOutput(currentRotationReference.subtract(currentRotations).getValue(),
				timestep.getValue());

		currentSpeed = pidOutput;

		return pidOutput;
	}

	@Override
	public void addRotations(T rotations) {
		currentRotationReference = (T) currentRotationReference.add(rotations);

	}

	@Override
	public T getRotations() {
		return currentRotations;
	}

	@Override
	public void setRotations(T rotations) {
		currentRotationReference = rotations;

	}

	public double getSpeed() {
		return currentSpeed;
	}

	public void runMotor(Time timestep) {
		currentRotations = (T) currentRotations.add(new Rotations(timestep.getValue() * currentSpeed));
	}

}
