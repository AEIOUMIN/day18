package com.bosic.day.demo;

public class Penguin extends Pet{
	private String sex;
	public Penguin(){
		
	}
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print(){
		super.print();
		System.out.println("我是一只"+this.sex);
	}
	public void eat() {
		if(getHealth()>=100){
			System.out.println("企鹅"+getName()+"已经吃饱了，谢谢主人");
		}else if(getHealth()<100){
			this.setHealth(this.getHealth()+3);
			System.out.println("企鹅"+getName()+"健康值增加3");
		}
	}
	public void swimming(){
		System.out.println("企鹅"+getName()+"正在游泳");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+3);		
	}
	
}
