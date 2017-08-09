package com.bosic.day.demo.test;

import com.bosic.day.demo.handset.CommonHandset;
import com.bosic.day.demo.handset.AptitudeHandset;

public class TestHandset {
	public static void main(String[] args) {
		CommonHandset com = new CommonHandset("普通","诺基亚");
		com.info();
		com.sendInfo();
		com.call();
		com.play("明天你好");
		System.out.println();
		
		AptitudeHandset apt = new AptitudeHandset("智能","苹果");
			apt.info();
			apt.takePictures();
			apt.networkconn();
			apt.sendInfo();
			apt.call();
			apt.play("后天");
			
		
}
}
