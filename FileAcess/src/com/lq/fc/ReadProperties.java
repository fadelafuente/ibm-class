package com.lq.fc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ReadProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Nanders\\Documents\\text1.txt");
			Properties p = new Properties();
			p.load(fis);
			String userName = p.getProperty("user.name");
			System.out.println(userName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("C:\\Users\\Nanders\\Documents\\text2.txt");
		if(f.isDirectory()) {
			String[] contents = f.list();
			for(String s : contents) 
				System.out.println(s);
		}
		
		Scanner scn = new Scanner(System.in);
		String temp = scn.nextLine();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Nanders\\Documents\\text3.txt"));
			bw.write(temp);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
