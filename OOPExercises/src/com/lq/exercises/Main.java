/**
 * 
 */
package com.lq.exercises;

/**
 * @author Nanders
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Car c1 = new Car(20, 40, true);
		// Car c2 = new Car();
		
		// c1.setSpeed(40);
		// c2.setSpeed(70);
		
		System.out.println(c1.getSpeed());
		System.out.println(c1.getGasoline());
		System.out.println(c1.isEngineState());
		*/
		// Lab
		Box b1 = new Box(3, 4, 5);
		Box b2 = new Box(2, 2, -2);
		Box b3 = new Box(0, 2, 2);
		
		b1.printBox();
		
		b2.printBox();
		b2.setLength(2);
		b2.printBox();
		
		b3.printBox();
	}

}
