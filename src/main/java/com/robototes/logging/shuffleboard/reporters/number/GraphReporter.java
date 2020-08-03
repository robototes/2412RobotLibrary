package com.robototes.logging.shuffleboard.reporters.number;

import java.util.Map;
import java.util.function.Supplier;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A graph widget
 *
 * @author Eli Orona
 *
 */
public class GraphReporter extends AbstractReporter<Number[], GraphReporter> {

	/**
	 * Creates a new Graph Widget
	 *
	 * @param getter  Number array supplier
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public GraphReporter(Supplier<Number[]> getter, String name, String tabName) {
		super(getter, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kGraph;
	}

	@Override
	public void update() {
		entry.forceSetNumberArray(getter.get());
	}

	/**
	 * Sets the visible time for data
	 *
	 * @param time The time in seconds
	 * @return this
	 */
	public GraphReporter withVisibleTime(int time) {
		return withProperties(Map.of("visibleTime", time));
	}

}
