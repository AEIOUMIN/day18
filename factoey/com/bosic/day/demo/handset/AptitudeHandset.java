package com.bosic.day.demo.handset;

import com.bosic.day.demo.impl.Network;
import com.bosic.day.demo.impl.PlayWiring;
import com.bosic.day.demo.impl.TheakPictures;

public class AptitudeHandset extends Handset implements PlayWiring,Network,TheakPictures{
	public AptitudeHandset(){
		
	}
	public AptitudeHandset(String type,String brand){
		super(type,brand);
	}
	@Override
	public void takePictures() {
		System.out.println("智能---------拍照");
		
	}



	@Override
	public void play(String context) {
		System.out.println("智能----播放视频《"+context+"》=======");
		
	}

	@Override
	public void sendInfo() {
		System.out.println("智能---------发送图片信息");
		
	}

	@Override
	public void call() {
		System.out.println("智能---------视频电话");
		
	}
	@Override
	public void networkconn() {
		System.out.println("连接网络");
		
	}

}
