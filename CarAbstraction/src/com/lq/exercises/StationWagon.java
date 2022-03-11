package com.lq.exercises;

public class StationWagon extends Car {

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed > 10 && speed < 100)
			this.speed = speed;
		else
			this.speed = speed;
	}

}
