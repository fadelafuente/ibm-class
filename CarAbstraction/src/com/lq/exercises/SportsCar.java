package com.lq.exercises;

public class SportsCar extends Car {
	private static final int MAX_SPEED = 200;

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed > MAX_SPEED)
			this.speed = MAX_SPEED;
		else
			this.speed = speed;
	}
	
	public void sp() {}
}
