package com.bosic.day.demo;

public class Dog extends Pet{
	private String strain;
	public Dog(){
		
	}
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
	}
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print(){
		super.print();
		System.out.println("我是一只"+this.strain);
	}
	public void eat() {
		if(getHealth()>=100){
			System.out.println("狗狗"+getName()+"已经吃饱了，谢谢主人");
		}else if(getHealth()<100){
			this.setHealth(this.getHealth()+5);
			System.out.println("狗狗"+getName()+"健康值增加5");
		}
		
	}
	public void catchingFlyDisc(){
		System.out.println("狗狗"+getName()+"正在玩接飞盘");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+5);
	}
	
}
