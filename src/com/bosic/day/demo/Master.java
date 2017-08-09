package com.bosic.day.demo;

public class Master {
	private String name;
	private int money;
	
	public Master() {
		
	}
	public Master(String name, int money) {
		
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void feed(Pet pet){
		pet.eat();
	}
	public Pet getId(int typeId){
		Pet pet = null;
		if(typeId==1){
			pet = new Dog("欧欧","雪娜瑞");
		}else if(typeId==2){
			pet = new Penguin("小艾","Q妹");
		}
		return pet;
	}
	public void play(Pet pet){
		if(pet instanceof Dog){
			Dog dog =(Dog)pet;
			dog.catchingFlyDisc();
			dog.print();
		}else if(pet instanceof Penguin){
			Penguin pgn = (Penguin)pet;
			pgn.swimming();
			pgn.print();
		}
	}
}
