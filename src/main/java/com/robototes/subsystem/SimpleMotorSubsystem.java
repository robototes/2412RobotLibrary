package com.robototes.subsystem;

import java.util.Arrays;

import com.robototes.math.MathUtils;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * @author Alex Stedman
 * 
 * A simple subsystem to control a group of motors
 */
public class SimpleMotorSubsystem extends SimpleSubsystem {
    //Motor Controller/Controller Group
    private SpeedController controller;
    //Max Motor Speed
    private double maxSpeed = 1;
    //Constructor
    public SimpleMotorSubsystem(SpeedController... speedControllers){
        if(speedControllers.length > 1)
            controller = new SpeedControllerGroup(speedControllers[0], Arrays.copyOfRange(speedControllers, 1, speedControllers.length-1));
        else
            controller = speedControllers[0];
    }

    //Set the Motor to run in
	@Override
    public void in() {
        controller.set(super.getInverted() ? maxSpeed : -maxSpeed);
    }
    //Set the motor to run out
    @Override
    public void out() {
        controller.set(super.getInverted() ? -maxSpeed : maxSpeed);
    }
    //Stop the motor
    public void stop(){
        controller.set(0);
    }
    //Set the motor to run at a set speed
    public void set(double speed){
        controller.set(MathUtils.constrain(speed, -maxSpeed, maxSpeed));
    }
    //getters and setters for max speed
    /**
     * @param val the max speed the motor can be set to (from 0 - 1)
     */
    public void setMaxSpeed(double val){
        maxSpeed = val;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
}