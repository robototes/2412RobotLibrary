package com.robototes.sensors;

import edu.wpi.first.networktables.NetworkTable;

/**
 * A wrapper class for the limelight system. This will be updated as more
 * features are needed
 *
 * @author Eli Orona
 *
 */
public class Limelight {
	/**
	 * The different camera modes of the limelight
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum CamMode {
		DRIVER_CAMERA(1), VISION_PROCESSER(0);

		private int modeID;

		private CamMode(int modeID) {
			this.modeID = modeID;
		}

		public int getModeID() {
			return modeID;
		}
	}

	/**
	 * The different LED modes of the limelight
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum LEDMode {
		BLINK(2), DEFAULT(0), OFF(1), ON(3);

		private int modeID;

		private LEDMode(int modeID) {
			this.modeID = modeID;
		}

		public int getModeID() {
			return modeID;
		}
	}

	/**
	 * The different pipelines of the limelight
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum Pipeline {
		EIGHT(8), FIVE(5), FOUR(4), NINE(9), ONE(1), SEVEN(7), SIX(6), THREE(3), TWO(2), ZERO(0);

		private int modeID;

		private Pipeline(int modeID) {
			this.modeID = modeID;
		}

		public int getModeID() {
			return modeID;
		}
	}

	/**
	 * The different snapshot modes of the limelight
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum SnapshotMode {
		OFF(0), TWO_PER_SECOND(1);

		private int modeID;

		private SnapshotMode(int modeID) {
			this.modeID = modeID;
		}

		public int getModeID() {
			return modeID;
		}
	}

	/**
	 * The different streaming modes of the limelight
	 *
	 * @author Eli Orona
	 *
	 */
	public static enum StreamMode {
		PIP_MAIN(1), PIP_SECONDARY(2), STANDARD(0);

		private int modeID;

		private StreamMode(int modeID) {
			this.modeID = modeID;
		}

		public int getModeID() {
			return modeID;
		}
	}

	CamMode camMode;
	LEDMode ledMode;
	NetworkTable networkTable;
	Pipeline pipeline;
	SnapshotMode snapshotMode;
	StreamMode streamMode;

	public Limelight(NetworkTable networkTable, LEDMode ledMode, CamMode camMode, Pipeline pipeline,
			StreamMode streamMode, SnapshotMode snapshotMode) {
		this.networkTable = networkTable;
		this.ledMode = ledMode;
		this.camMode = camMode;
		this.pipeline = pipeline;
		this.streamMode = streamMode;
		this.snapshotMode = snapshotMode;
	}

	public CamMode getCamMode() {
		return camMode;
	}

	public LEDMode getLedMode() {
		return ledMode;
	}

	public NetworkTable getNetworkTable() {
		return networkTable;
	}

	public Pipeline getPipeline() {
		return pipeline;
	}

	public SnapshotMode getSnapshotMode() {
		return snapshotMode;
	}

	public StreamMode getStreamMode() {
		return streamMode;
	}

	public double getTS() {
		return networkTable.getEntry("ts").getDouble(Double.NaN);
	}

	public double getTX() {
		return networkTable.getEntry("tx").getDouble(Double.NaN);
	}

	public double getTY() {
		return networkTable.getEntry("ty").getDouble(Double.NaN);
	}

	public boolean hasValidTarget() {
		return networkTable.getEntry("tv").getDouble(0) == 1f;
	}

	public void setCamMode(CamMode camMode) {
		networkTable.getEntry("camMode").setNumber(camMode.getModeID());
		this.camMode = camMode;
	}

	public void setLedMode(LEDMode ledMode) {
		networkTable.getEntry("ledMode").setNumber(ledMode.getModeID());
		this.ledMode = ledMode;
	}

	public void setPipeline(Pipeline pipeline) {
		networkTable.getEntry("pipeline").setNumber(pipeline.getModeID());
		this.pipeline = pipeline;
	}

	public void setSnapshotMode(SnapshotMode snapshotMode) {
		networkTable.getEntry("snapshot").setNumber(snapshotMode.getModeID());
		this.snapshotMode = snapshotMode;
	}

	public void setStreamMode(StreamMode streamMode) {
		networkTable.getEntry("stream").setNumber(streamMode.getModeID());
		this.streamMode = streamMode;
	}
}
