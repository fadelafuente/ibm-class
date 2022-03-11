package com.javaoo.store;

public class Item {
	private String title;
	private double price;
	private int quality;
	
	/**
	 * @param title
	 * @param price
	 * @param quantity
	 */
	public Item(String title, double price, int quantity) {
		setTitle(title);
		setPrice(price);
		setQuality(quantity);
	}
	/**
	 * 
	 */
	public Item() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	
	
}
