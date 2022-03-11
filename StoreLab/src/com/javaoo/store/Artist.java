package com.javaoo.store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
	private String name;
	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String>> memberInstruments;
	
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers() {
		return memberNames;
	}
	
	public SortedSet<String> getInstruments(String member) {
		return memberInstruments.get(member);
	}

	/**
	 * @param name
	 */
	public Artist(String name) {
		this();
		setName(name);
	}
	/**
	 * 
	 */
	public Artist() {
		memberNames = new TreeSet<String>();
		memberInstruments = new TreeMap<String, SortedSet<String>>();
	}
	public Artist(String name, SortedSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
		setName(name);
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
	}
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * @param memberNames
	 * @param memberInstruments
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
