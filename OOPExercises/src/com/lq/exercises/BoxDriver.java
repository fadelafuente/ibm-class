package com.lq.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		Box box1 = new Box(7, 6, 5);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());

		System.out.println("Box 2 length is " + box2.getLength());
		System.out.println("Box 2 width is " + box2.getWidth());
		System.out.println("Box 2 height is " + box2.getHeight());
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());
		
		System.out.println("Box 1 Volume is " + box1.getVolume());
		
		box1.printBox();
		box1.setLength(-5);
		box1.setWidth(0);
		box1.setHeight(-5);
		box1.printBox();
		
		Box box3 = new Box(-4, 0, 5);
		box3.printBox();
	}

}
