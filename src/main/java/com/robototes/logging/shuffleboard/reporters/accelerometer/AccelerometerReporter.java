package com.robototes.logging.shuffleboard.reporters.accelerometer;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public class AccelerometerReporter extends AbstractReporter<Accelerometer, AccelerometerReporter> {

	public AccelerometerReporter(Accelerometer accelerometer, String name, String tabName) {
		super(() -> accelerometer, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kAccelerometer;
	}

	/**
	 * Shows the tick ring
	 *
	 * @param show Show the ring
	 * @return this
	 */
	public AccelerometerReporter showTickMarks(boolean show) {
		return withProperties(Map.of("showTickMarkRing", show));
	}

	/**
	 * Enables showing the value on the widget
	 *
	 * @param show Show the value
	 * @return this
	 */
	public AccelerometerReporter showValue(boolean show) {
		return withProperties(Map.of("showValue", show));
	}

	@Override
	public void update() {
	}

	/**
	 * Sets the min and max of the widget
	 *
	 * @param min min
	 * @param max max
	 * @return this
	 */
	public AccelerometerReporter withMinMax(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min, " + min + ", is greater than max, " + max + "!");
		}

		return withProperties(Map.of("min", min, "max", max));
	}

	/**
	 * Sets the precision of the widget
	 *
	 * @param precision Precision
	 * @return this
	 */
	public AccelerometerReporter withPrecision(int precision) {
		return withProperties(Map.of("precision", precision));
	}

}
