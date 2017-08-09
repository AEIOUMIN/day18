package com.bosic.day.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		/*int[] arr = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
		System.out.print("请输入数组的数：");
		arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length-1;i++){			
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] =temp;
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		
		
		
			
		int[] arr = {2,5,4,8,1,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++)
			if(min<arr[j]){
				min=arr[j];
			}
		}	
		System.out.println(min);
		
	}
	
}
