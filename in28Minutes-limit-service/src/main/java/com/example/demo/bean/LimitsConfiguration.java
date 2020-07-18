package com.example.demo.bean;

public class LimitsConfiguration {

	private int maximum;
	private int minimum;

	public LimitsConfiguration() {
		super();
	}

	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

}
