package com.lq.d;

public class SportsCar extends Car {
	private int horsePower;

	public SportsCar() {
		speed = 100;
	}
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed() * 2;
	}
	
	
}
