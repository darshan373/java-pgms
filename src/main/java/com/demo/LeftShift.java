package com.demo;
import java.util.Arrays;
public class LeftShift {
public static void left(int[] arr,int k) {
	for(int i=1;i<=k%arr.length;i++) {
		int temp=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
			
			
		}
		arr[arr.length-1]=temp;
	}

	
}
public static void main(String[] args) {
	int[] nums= {1,2,3,4,5,6,7};
	left(nums,3);
	
	System.out.println(Arrays.toString(nums));
}
}