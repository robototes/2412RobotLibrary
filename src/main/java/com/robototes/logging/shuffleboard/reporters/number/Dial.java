package com.robototes.logging.shuffleboard.reporters.number;

import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;

import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public class Dial extends NumberReporter<Dial> {

	public Dial(Supplier<Double> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return null;
	}

}
