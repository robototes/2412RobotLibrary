package com.robototes.logging.shuffleboard.reporters.accelerometer;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.interfaces.Accelerometer.Range;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * Supported types:
 * <ul>
 * <li>{@link edu.wpi.first.wpilibj.ADXL345_I2C}</li>
 * <li>{@link edu.wpi.first.wpilibj.ADXL345_SPI}</li>
 * <li>{@link edu.wpi.first.wpilibj.ADXL362}</li>
 * </ul>
 *
 * @author Eli Orona
 *
 */
public class ThreeAxisAccelerometerReporter extends AbstractReporter<Accelerometer, ThreeAxisAccelerometerReporter> {

	/**
	 * Creates a new Three Axis Gyro
	 *
	 * @param accelerometer Accelerometer
	 * @param name          Widget name
	 * @param tabName       Tab name
	 */
	public ThreeAxisAccelerometerReporter(Accelerometer accelerometer, String name, String tabName) {
		super(() -> accelerometer, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.k3AxisAccelerometer;
	}

	/**
	 * Shows the tick ring
	 *
	 * @param show Show the ring
	 * @return this
	 */
	public ThreeAxisAccelerometerReporter showTickMarks(boolean show) {
		return withProperties(Map.of("showTickMarkRing", show));
	}

	/**
	 * Enables showing the value on the widget
	 *
	 * @param show Show the value
	 * @return this
	 */
	public ThreeAxisAccelerometerReporter showValue(boolean show) {
		return withProperties(Map.of("showValue", show));
	}

	@Override
	public void update() {
	}

	/**
	 * Sets the precision of the widget
	 *
	 * @param precision Precision
	 * @return this
	 */
	public ThreeAxisAccelerometerReporter withPrecision(int precision) {
		return withProperties(Map.of("precision", precision));
	}

	/**
	 * Sets the range of the widget
	 *
	 * @param range Range
	 * @return this
	 */
	public ThreeAxisAccelerometerReporter withRange(Range range) {
		return withProperties(Map.of("range", range));
	}

}
