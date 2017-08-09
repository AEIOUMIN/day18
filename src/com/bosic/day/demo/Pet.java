package com.bosic.day.demo;

public abstract class Pet {
	private String name="无名氏";
	private int health=100;
	private int love=0;
	public Pet(){
		
	}
	public Pet(String name) {		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}	
	public int getLove() {
		return love;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void eat();
	public void print(){
		System.out.println("宠物的自白：\n我的名字是"+this.name+"我的健康值是"+this.health+"我与主人的亲密度是"+this.love+"。");
	}
}
