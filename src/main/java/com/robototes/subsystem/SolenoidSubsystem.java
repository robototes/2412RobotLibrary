package com.robototes.subsystem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class SolenoidSubsystem extends SubsystemBase implements OnOffSubsystem {

	protected boolean m_inverted = false;

	protected final String m_name;
	protected final Solenoid m_solenoid;

	protected final SubsystemType m_type;

	public SolenoidSubsystem(Solenoid solenoid, String name, SubsystemType type) {
		m_name = name;
		m_type = type;
		m_solenoid = solenoid;
	}

	public SolenoidSubsystem(Solenoid solenoid, String name, SubsystemType type, boolean invertedOnStart) {
		this(solenoid, name, type);
		m_inverted = invertedOnStart;
	}

	@Override
	public String getRobototesName() {
		return m_name;
	}

	/**
	 * Gets the solenoid of the subsystem
	 *
	 * @return The solenoid
	 */
	public Solenoid getSolenoid() {
		return m_solenoid;
	}

	@Override
	public SubsystemType getSubsystemType() {
		return m_type;
	}

	@Override
	public void invert(boolean inverted) {
		m_inverted = inverted;
	}

	@Override
	public boolean isInverted() {
		return m_inverted;
	}

	@Override
	public void off() {
		m_solenoid.set(invertBoolean(false));
	}

	@Override
	public void on() {
		m_solenoid.set(invertBoolean(true));
	}

}
