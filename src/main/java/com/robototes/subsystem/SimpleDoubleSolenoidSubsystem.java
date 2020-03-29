package com.robototes.subsystem;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * @author Alex Stedman
 * 
 * A simple subsystem for Double Solenoids
 */
public class SimpleDoubleSolenoidSubsystem extends SimpleSubsystem {
    //the Double Solenoid
    private DoubleSolenoid solenoid;

    //constructor
    public SimpleDoubleSolenoidSubsystem(DoubleSolenoid s){
       solenoid = s;
    }
    
    //extend the Double Solenoid
    @Override
    public void in() {
        solenoid.set(super.getInverted() ? Value.kReverse : Value.kForward);
    }
    
    //Retract the Double Solenoid
    @Override
    public void out() {
        solenoid.set(super.getInverted() ? Value.kForward : Value.kReverse);
    }

    //Stop/Turn off the Double Solenoid
    public void stop(){
        solenoid.set(Value.kOff);
    }
}