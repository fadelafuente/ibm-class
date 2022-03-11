/**
 * 
 */
package com.lq.exercises;

/**
 * @author Nanders
 *
 */
public class CubeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube1 = new Cube(5);
		Cube cube2 = new Cube(8);
		
		/*
		System.out.println("length = " + cube1.getLength());
		System.out.println("width = " + cube1.getWidth());
		System.out.println("height = " + cube1.getHeight());

		System.out.println("length = " + cube2.getLength());
		System.out.println("width = " + cube2.getWidth());
		System.out.println("height = " + cube2.getHeight());
		*/
		
		cube1.setLength(20);
		cube1.printBox();
		
		cube1.setLength(40);
		cube1.setWidth(-5);
		cube1.printBox();
		
		// cube2.printBox();
		// cube2.setWidth(-5);
		// cube2.printBox();
		
	}

}
