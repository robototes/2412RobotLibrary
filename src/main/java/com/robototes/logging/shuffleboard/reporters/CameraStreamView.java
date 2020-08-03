package com.robototes.logging.shuffleboard.reporters;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A widget for camera streams
 *
 * @author Eli Orona
 *
 */
public class CameraStreamView extends AbstractReporter<VideoSource, CameraStreamView> {

	/**
	 * Rotations for the camera widget
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum Rotation {
		/**
		 * Half rotation
		 */
		HALF("HALF"),
		/**
		 * No rotation
		 */
		NONE("NONE"),
		/**
		 * Quarter turn clockwise
		 */
		QUARTER_CLOCK_WISE("QUARTER_CW"),
		/**
		 * Quarter turn counter-clockwise
		 */
		QUARTER_COUNTER_CLOCK_WISE("QUARTER_CCW");

		private final String value;

		private Rotation(String value) {
			this.value = value;
		}

		/**
		 *
		 * @return The string value for the rotation
		 */
		public String getValue() {
			return value;
		}
	}

	/**
	 *
	 * @param video   The video source
	 * @param name    The widget name
	 * @param tabName The tab name
	 */
	public CameraStreamView(VideoSource video, String name, String tabName) {
		super(() -> video, name, tabName);
	}

	/**
	 * Sets the crosshair color
	 *
	 * @param color Color of the crosshair
	 * @return this
	 */
	public CameraStreamView crosshairColor(String color) {
		return withProperties(Map.of("crosshairColor", color));
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kCameraStream;
	}

	/**
	 * Sets the show controls of the widget
	 *
	 * @param show Show controls
	 * @return this
	 */
	public CameraStreamView showControls(boolean show) {
		return withProperties(Map.of("showControls", show));
	}

	/**
	 * Sets the crosshair of the widget
	 *
	 * @param show Show the crosshair
	 * @return this
	 */
	public CameraStreamView showCrosshair(Boolean show) {
		return withProperties(Map.of("showCrosshair", show));
	}

	@Override
	public void update() {
	}

	/**
	 * Sets the rotation of the widget
	 *
	 * @param rotation The rotation
	 * @return this
	 */
	public CameraStreamView withRotation(Rotation rotation) {
		return withProperties(Map.of("rotation", rotation.getValue()));
	}
}
