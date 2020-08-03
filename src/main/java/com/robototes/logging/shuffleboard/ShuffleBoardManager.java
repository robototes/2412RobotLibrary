package com.robototes.logging.shuffleboard;

import java.util.ArrayList;
import java.util.List;

/**
 * The controller for all the Shuffle board widgets
 *
 * @author Eli Orona
 *
 */
public class ShuffleBoardManager {

	/**
	 * The main instance
	 */
	private static ShuffleBoardManager instance;

	/**
	 *
	 * @return The instance of the Manager
	 */
	public static ShuffleBoardManager getInstance() {
		if (instance == null) {
			instance = new ShuffleBoardManager();
		}

		return instance;
	}

	/**
	 * The iteration of the loop
	 */
	private int loopIteration;

	/**
	 * The Reporters
	 */
	private List<IReporter<?, ?>> reporters;

	/**
	 * No public instances for you
	 */
	private ShuffleBoardManager() {
		reporters = new ArrayList<>();
	}

	/**
	 * Adds a widget
	 *
	 * @param iReporter
	 */
	public void add(IReporter<?, ?> iReporter) {
		reporters.add(iReporter);
	}

	public void reset() {
		reporters.clear();
	}

	/**
	 * Updates all widgets
	 *
	 * @see {@link #update(int) update}
	 */
	public void update() {
		reporters.forEach(IReporter::update);
	}

	/**
	 * Updates all widgets every {@code loop} times
	 *
	 * @param loop How many iterations to skip when updating
	 */
	public void update(int loop) {
		if (loopIteration++ % loop == 0) {
			update();
		}
	}
}
