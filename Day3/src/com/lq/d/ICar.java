package com.lq.d;

public interface ICar {
	public void setSpeed(int speed) throws SpeedOutOfRangeException, SpeedWayOutOfRangeException;
	public int getSpeed();
	public void setGasoline(int gasoline);
	public int getGasoline();
}
