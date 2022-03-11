package com.lq.exercises;

public class Car {
	private int speed, gasoline;
	private boolean engineState;
	
	Car(int s, int g, boolean e) {
		speed = s;
		gasoline = g;
		engineState = e;
	}

	public void setSpeed(int s) {
		speed = s;
	}
	
	public void setGasoline(int g) {
		gasoline = g;
	}
	
	public void setEngineState(boolean e) {
		engineState = e;
	}
	
	public int getSpeed() { return speed; }
	
	public int getGasoline() { return gasoline; }
	
	public boolean isEngineState() { return engineState; }
}
