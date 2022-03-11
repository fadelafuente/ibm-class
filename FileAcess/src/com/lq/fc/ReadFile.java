package com.lq.fc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream inFile = new FileInputStream("C:\\Users\\Nanders\\Documents\\text.txt");
			Reader inStream = new InputStreamReader(inFile);
			LineNumberReader lineReader = new LineNumberReader(inStream);
			lineReader.lines().forEach(line -> System.out.println(line));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
