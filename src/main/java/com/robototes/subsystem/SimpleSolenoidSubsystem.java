package com.robototes.subsystem;

import edu.wpi.first.wpilibj.Solenoid;

/**
 * @author Alex Stedman
 * 
 * A simple subsystem for Single Solenoids
 */
public class SimpleSolenoidSubsystem extends SimpleSubsystem {
    //the solenoid
    private Solenoid solenoid;

    //constructor
    public SimpleSolenoidSubsystem(Solenoid s){
       solenoid = s;
    }
    
    //Extend the Solenoid
    @Override
    public void in() {
        solenoid.set(!super.getInverted());
    }
    //Retract the Solenoid
    @Override
    public void out() {
        solenoid.set(super.getInverted());
    }
    
}