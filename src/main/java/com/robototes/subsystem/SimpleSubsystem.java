package com.robototes.subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
/** 
 * @author Alex Stedman
 * The parent class of all simple subsystems
*/
public abstract class SimpleSubsystem extends SubsystemBase {
    //The two functions each subsystem will have
    
    abstract void in();
    abstract void out();

    //handle subsystem inversion
    private boolean inverted = false;
    //getters and setters
    public void setInverted(boolean b){
        inverted = b;
    }
    public boolean getInverted(){
        return inverted;
    }
    
}