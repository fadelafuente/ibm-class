package com.lq.exercises;

public class Cube extends Box {
	private void setSide(double side) {
		double previous = super.getHeight();
		if(previous == side)
			return;
		super.setHeight(side);
		if(previous == super.getHeight())
			return;
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return super.getHeight();
	}
	
	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		setSide(height);
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		setSide(width);
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		setSide(length);
	}

	/**
	 * @param s
	 */
	public Cube(double side) {
		super(side);
		// TODO Auto-generated constructor stub
	}
}
