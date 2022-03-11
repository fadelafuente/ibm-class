package com.lq.d;

public class StationWagon extends Car {
	private int cargoCapacity;
	private int cargoLoad;
	
	public StationWagon( ) {
		try {
			setSpeed(80);
		} catch (SpeedOutOfRangeException | SpeedWayOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public int getCargoLoad() {
		return cargoLoad;
	}
	public void setCargoLoad(int cargoLoad) {
		this.cargoLoad = cargoLoad;
	}
	
	@Override
	public void setSpeed(int speed) throws SpeedOutOfRangeException, SpeedWayOutOfRangeException {
		// TODO Auto-generated method stub
		if(speed > 400) {
			throw new SpeedOutOfRangeException();
		}
		if(speed > 100) {
			throw new SpeedOutOfRangeException();
		}
		super.setSpeed(speed / 2);
	}
	
}
