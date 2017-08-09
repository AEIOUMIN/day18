package com.bosic.day.demo;

import java.util.Scanner;

public class TestPet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物商店");
		Master master = new Master("王先生",100);
		System.out.println("请选择您想要的宠物（1，狗狗        2，企鹅）：");
		int typeId = input.nextInt();
		Pet pet = master.getId(typeId);
		if(pet!=null){
			System.out.println("领养成功!");
			master.feed(pet);
			master.play(pet);
		}else{
			System.out.println("没有该宠物，领养失败");
		}
	}
}
