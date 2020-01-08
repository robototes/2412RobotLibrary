package com.robototes.math;

/**
 * 
 * @author OroArmor
 *
 */
public class Equation {
	private double[] terms;

	/**
	 * 
	 * @param terms the terms for the equation, currently only doubles are
	 *              supported. terms go from x^0 to x^n.
	 */
	public Equation(double... terms) {
		this.terms = terms;
	}

	public double calculate(double x) {

		double t = 1;
		double y = 0;

		for (double term : terms) {
			y += term * t;
			t *= x;
		}

		return y;
	}

	public double[] getTerms() {
		return terms;
	}

	@Override
	public String toString() {
		String equation = "";
		int i = 0;
		for (double term : terms) {
			equation = term + ((i++ != 0) ? "x^" + (i - 1) + " + " : "") + equation;
		}

		return "y = " + equation;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Equation)) {
			return false;
		} else {
			Equation other = (Equation) o;

			if (other.terms.length != this.terms.length) {
				return false;
			}

			for (int i = 0; i < this.terms.length; i++) {
				if (!MathUtils.epsilonEquals(this.terms[i], other.terms[i], MathUtils.EPSILON)) {
					return false;
				}
			}
		}
		return true;
	}
}
