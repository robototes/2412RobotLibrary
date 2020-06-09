package com.robototes.logging.shuffleboard.reporters;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.IReporter;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

public class CameraStreamView implements IReporter<VideoSource, CameraStreamView> {

	@Override
	public WidgetType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier<VideoSource> getReporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTabName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CameraStreamView withSize(int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CameraStreamView withPosition(int columnIndex, int rowIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CameraStreamView withProperties(Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CameraStreamView build() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasBeenBuilt() {
		// TODO Auto-generated method stub
		return false;
	}

}
