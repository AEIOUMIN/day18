package com.bosic.day.demo.handset;

public abstract class Handset {
	private String type;
	private String brand;
	public Handset() {
		
	}
	public Handset(String type, String brand) {
		super();
		this.type = type;
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void info(){
		System.out.println("这是一部"+this.type+"的"+this.brand+"的手机");
	}
	public abstract void sendInfo();
	public abstract void call();
	
}
