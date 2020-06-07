package com.robototes.logging.shuffleboard;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;


@SuppressWarnings("unchecked")
public abstract class BooleanConfig<S extends BooleanConfig<S>> implements IConfigurable<Boolean, S> {

	private final Supplier<Boolean> getter;
	private final Consumer<Boolean> setter;
	private final String name;
	private final String tabName;

	private boolean built = false;
	private Map<String, Object> allProperties;
	private SimpleWidget widget;
	
	private boolean oldValue;

	private NetworkTableEntry entry;
	
	public BooleanConfig(Supplier<Boolean> getter, Consumer<Boolean> setter, String name, String tabName) {
		this.getter = getter;
		this.setter = setter;
		this.name = name;
		this.tabName = tabName;

		widget = Shuffleboard.getTab(getTabName()).add(getName(), getter).withWidget(getType());
	}
	
	public Supplier<Boolean> getReporter() {
		return getter;
	}

	public Consumer<Boolean> getSetter() {
		return setter;
	}
	
	public void initializeWidget() {
		ShuffleBoardManager.getInstance().add(this);
		entry = widget.withProperties(allProperties).getEntry();
		oldValue = getter.get();
	}
	
	@Override
	public void update() {
		Boolean value = entry.getBoolean(false);	// Get the value of the shuffleboard widget

		if (value == oldValue) {					// if it's the same to what it was last update 
			boolean newValue = getter.get();		// get the object's value (object == whatever you have the thing set to)
			entry.setBoolean(newValue);				// Set the widgets value to the object's value i.e. update the widget
			oldValue = newValue;
		} else {              					  
			setter.accept(value);					// Set's the objects value to what the entry 
		}
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getTabName() {
		return tabName;
	}
	
	@Override
	public S withSize(int width, int height) {
		checkNotBuilt();
		widget.withSize(width, height);
		return (S) this;
	}

	@Override
	public S withPosition(int columnIndex, int rowIndex) {
		checkNotBuilt();
		widget.withPosition(columnIndex, rowIndex);
		return (S) this;
	}

	@Override
	public S withProperties(Map<String, Object> properties) {
		checkNotBuilt();
		if (this.allProperties == null) {
			allProperties = properties;
		} else {
			allProperties.putAll(properties);
		}
		return (S) this;
	}

	@Override
	public S build() {
		checkNotBuilt();
		initializeWidget();
		built = true;
		return (S) this;
	}

	@Override
	public boolean hasBeenBuilt() {
		return built;
	}
	
}
