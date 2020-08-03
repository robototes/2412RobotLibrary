package com.robototes.logging.shuffleboard.reporters.hardware;

import java.util.Map;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * PDP Widget
 *
 * @author Eli Orona
 *
 */
public class PDPReporter extends AbstractReporter<PowerDistributionPanel, PDPReporter> {

	/**
	 * Creates a new PDP widget
	 *
	 * @param panel   The PDP
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public PDPReporter(PowerDistributionPanel panel, String name, String tabName) {
		super(() -> panel, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kPowerDistributionPanel;
	}

	/**
	 * Show the voltage and current values
	 *
	 * @param show Show the values
	 * @return this
	 */
	public PDPReporter showValues(boolean show) {
		return withProperties(Map.of("showValues", show));
	}

	@Override
	public void update() {
	}

}
