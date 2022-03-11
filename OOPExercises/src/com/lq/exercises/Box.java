package com.lq.exercises;

public class Box {
	private double height;
	private double width;
	private double length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height <= 0) {
			System.out.println("Height must be greater than 0");
			return;
		}
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width <= 0) {
			System.out.println("Width must be greater than 0");
			return;
		}
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length <= 0) {
			System.out.println("Length must be greater than 0");
			return;
		}
		this.length = length;
	}
	
	/**
	 * @param height
	 * @param width
	 * @param length
	 */
	public Box(double height, double width, double length) {
		if(length <= 0) 
			length = 1;
		if(width <= 0)
			width = 1;
		if(height <= 0)
			height = 1;
		setLength(length);
		setWidth(width);
		setHeight(height);
	}
	
	/**
	 * @param s to make a cube
	 */
	public Box(double s) {
		this(s, s, s);
	}
	
	public double getVolume() {
		return getLength() * getWidth() * getHeight();
	}
	
	public double getSurfaceArea() {
		return 2 * (getLength() * getWidth() + getLength() * getHeight() + getWidth() * getHeight());
	}
	
	public void printBox() {
		if(getLength() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
			System.out.printf("Box(h = %f, w = %f, l = %f) contains invalid properties\n", getHeight(), getWidth(), getLength());
		} else {
			System.out.println("Length       = " + getLength());
			System.out.println("Width        = " + getWidth());
			System.out.println("Height       = " + getHeight());
			System.out.println("Volume       = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
	}
}
