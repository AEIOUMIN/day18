package com.bosic.day.demo.handset;

import com.bosic.day.demo.impl.PlayWiring;

public class CommonHandset extends Handset implements PlayWiring{
	public CommonHandset(){
		
	}
	public CommonHandset(String type,String brand){
		super(type,brand);
	}
	@Override
	public void sendInfo() {
		System.out.println("发送信息-------");
		
	}
	@Override
	public void call() {
		System.out.println("打电话-------");
		
	}
	@Override
	public void play(String context) {
		System.out.println("播放音乐《"+context+"》=====");
		
	}
	
}
