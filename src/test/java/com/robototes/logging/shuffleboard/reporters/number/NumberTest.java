package com.robototes.logging.shuffleboard.reporters.number;

import static org.junit.Assert.assertEquals;

import com.robototes.logging.shuffleboard.DoubleField;
import com.robototes.logging.shuffleboard.ReporterTest;
import com.robototes.logging.shuffleboard.reporters.abst.NumberReporter;
import com.robototes.math.MathUtils;

import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public abstract class NumberTest<T extends NumberReporter<T>> extends ReporterTest<T> {

	public NumberTest(String name, String tabName, WidgetType type) {
		super(name, tabName, type);
	}

	protected DoubleField field = new DoubleField();

	@Override
	public void testUpdate() {
		double number = -1;
		field.setValue(number);
		reporter.update();
		assertEquals("Number Bar set correct shuffleboard value", number,
				(Double) reporter.getEntry().getNumber(Double.NaN), MathUtils.EPSILON);
	}

}
