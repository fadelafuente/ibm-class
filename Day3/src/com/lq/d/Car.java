package com.lq.d;

public class Car implements ICar {
	protected int speed = 50;
	private int maxSpeed;
	private int gasoline;
	private boolean engineState;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) throws SpeedOutOfRangeException, SpeedWayOutOfRangeException {
		if(speed > 500) {
			throw new SpeedWayOutOfRangeException();
		}
		if(speed > 200) {
			throw new SpeedOutOfRangeException();
		}
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
}
