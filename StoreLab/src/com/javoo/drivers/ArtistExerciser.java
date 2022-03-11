package com.javoo.drivers;

import java.util.*;

import com.javaoo.store.Artist;

public class ArtistExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist hotPlate = new Artist();
		TreeSet<String> instruments1 = new TreeSet<String>();
		instruments1.add("Piano");
		instruments1.add("Clarinet");
		instruments1.add("Hurdy Gurdy");
		instruments1.add("Tuba");
		hotPlate.addMember("Tom", instruments1);
		
		TreeSet<String> instruments2 = new TreeSet<String>();
		instruments2.add("Piano");
		instruments2.add("Trombone");
		instruments2.add("Baritone");
		instruments2.add("Viola");
		hotPlate.addMember("Jerry", instruments2);
		
		printMemberInstruments(hotPlate, "Tom");
		printMemberInstruments(hotPlate, "Jerry");
	}
	
	private static void printMemberInstruments(Artist artist, String memberName) {
		System.out.println("HotPlate band member " + memberName + " plays: ");
		for(String instrument : artist.getInstruments(memberName)) {
			System.out.println("\t" + instrument);
		}
	}

}
