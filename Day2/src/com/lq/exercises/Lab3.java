/**
 * 
 */
package com.lq.exercises;

/**
 * @author Nanders
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Exercise 1
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", 
		"Wednesday", "Thursday", "Friday", "Saturday"};
		
		for(int i = 0; i < daysOfWeek.length; i++)
			System.out.println(daysOfWeek[i]);
		
		for(int i = daysOfWeek.length - 1; i >= 0; i--)
			System.out.println(daysOfWeek[i]);
		*/
		/* Exercise 2
		int j = 0;
		while(j < 20) {
			j++;
			if(j % 2 != 0)
				continue;
			System.out.println(j);
		}
		*/
		/* Excercise 3
		for(int k = 1; k <= 100; k++) {
			if(k == 50)
				k += 11;
			System.out.print(k + " ");
		}
		*/
		/* Exercise 4
		int l = 0;
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		while(l < 12) {
			System.out.print(monthNames[l] + " has ");
			switch(l) {
			case 1:
				System.out.println("28 days");
				break;
			case 3:
			case 5:
			case 8:
			case 10:
				System.out.println("30 days");
				break;
			default:
				System.out.println("31 days");
				break;
			}
			l++;
		}
		*/
		// Challenge Exercise
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		int start = 6;
		int i = 1;
		int day = 1;
		while(day < 31) {
			while(i != start && day == 1) {
				System.out.print("     ");
				i++;
			}
			
			System.out.print(day);
			if(day < 10)
				System.out.print("    ");
			else
				System.out.print("   ");
			
			start++;
			if(start == 8) {
				start = 1;
				System.out.print("\n");
			}
			day++;
		}
	}
}
