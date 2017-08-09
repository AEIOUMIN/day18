package com.bosic.day.demo1;

public abstract class MotoVehicle {
	private String no;//车牌号
	private String brand;//车品牌
	public MotoVehicle() {
		
	}
	public MotoVehicle(String no, String brand) {
		super();
		this.no = no;
		this.brand = brand;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 抽象方法，计算汽车租赁价
	 * @param days
	 */
	public abstract void calRent(int days);
}
