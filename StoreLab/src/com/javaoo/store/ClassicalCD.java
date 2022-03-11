package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	private String composer;
	private String[] performers = new String[5];
	private int performerCount = 0;
	private String recordingLocation;
	private Date releaseDate;
	
	public void showPerformers() {
		System.out.println("Performers: ");
		
		for(int i = 0; i < performerCount; i++)
			System.out.println(performers[i]);
	}
	
	public void addPerformer(String Performer) {
		if(performerCount < performers.length) 
			performers[performerCount++] = Performer;
		else
			System.out.println("Cannot add more performers to " + getTitle());
	}
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
