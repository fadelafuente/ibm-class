package com.lq.exercises;

public abstract class Car {
	protected int speed;
	private boolean engineState;
	
	public abstract void setSpeed(int speed);

	public int getSpeed() {
		return speed;
	}

	public boolean isEngineState() {
		return engineState;
	}

}
