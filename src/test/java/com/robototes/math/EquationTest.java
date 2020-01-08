package com.robototes.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquationTest {

	@Test
	public void testCalculate() {
		Equation equation = new Equation(0, 0, 1); // y = x^2
		double x = 3;
		assertEquals("Simple equation has correct value", x * x, equation.calculate(x), MathUtils.EPSILON);
	}
}
