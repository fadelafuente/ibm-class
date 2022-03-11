package com.javoo.drivers;

import java.util.*;
import java.io.*;

import com.javaoo.store.Book;

public class BookExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:\\Users\\Nanders\\Documents\\book1.txt";
		List<Book> books = readBooksFromFile(location);
		
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
	}
	
	public static List<Book> readBooksFromFile(String name) {
		List<Book> books = null;

		try {
			books = new ArrayList<Book>();
			double price = 0.0;
			FileInputStream inStream = new FileInputStream(name);
			InputStreamReader inReader = new InputStreamReader(inStream);
			LineNumberReader lineReader = new LineNumberReader(inReader);
			
			String title;
			while((title = lineReader.readLine()) != null) {
				String author = lineReader.readLine();
				String line3 = lineReader.readLine();
				if(author != null && line3 != null) {
					price = Double.parseDouble(line3);
					
					// Why not have quantity, publisher, and genre passed in as well?
					Book book = new Book(title, price, 5, author, null, "NON-FICTION");
					books.add(book);
				} 
			}
			lineReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return books;	
	}
}