package com.javoo.drivers;

import java.util.Date;

import com.javaoo.store.*;

public class InventoryDrivers {

	public static void main(String[] args) {
		Item[] myInventory = new Item[50];

		myInventory[0] = new Book("Gregor the Overlander", 3.99, 1, "Suzanne Collins", "Scholastic", "Fantasy");
		myInventory[1] = new Book("Percy Jackson", 17.99, 2, "Rick Riordan", "Disney Publishing", "Fantasy");
		myInventory[2] = new Book("To Kill a Mockingbird", 17.99, 3, "Harper Lee", "J. B. Lippincott & Co.", "Southern Gothic Fiction");
		myInventory[3] = new Book("Dune", 9.99, 4, "Frank Herbert", "Chilton Books", "Science Fiction");
		myInventory[4] = new Book("Foundation", 7.99, 5, "Isaac Asimov", "Gnome Press", "Science Fiction");
		myInventory[5] = new CD("1940 Carmen", 10.19, 1, new Artist("Mon Laferte"), new Date("10/29/2021"));
		myInventory[6] = new CD("Joanne", 8.99, 3, new Artist("Lady Gaga"), new Date("10/21/2016"));
		myInventory[7] = new CD("MADE", 32.72, 2, new Artist("Big Bang"), new Date("12/13/2016"));

	}

}
