package com.demo;
import java.util.Arrays;
public class Ascendion {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(+j);
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print(+j);
			}
			System.out.println();
		}
	}
	public static void armstrong(int n) {
		int count=0;
		int num=n;
		
		while(num>0) {
			count++;
			num/=10;
			
		}
		num=n;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit,count);
			num/=10;
		}
		System.out.println(sum==n);
				
	}
	public static void leftshift(int[] arr,int k) {
		for(int j=1;j<=k;j++) {
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void series(int n) {
		for(int i=0;i<=n;i++) {
			int num=(int)Math.pow(i,3)+1;
			System.out.print(+num+"\t");
		}System.out.println();
	}
	public static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1 || j==n || i==n) {
					if(j%2!=0) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i-j>=0 || i+j>=2*n) {
					if(j<=n) {
						System.out.print(+j);
					}
					else {
						int num=j-2*(j%5);
						System.out.print(+num);
					}
					
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	pattern(5);
	armstrong(1634);
	int[] nums= {1,2,3,4,5,6,7,8,9};
	leftshift(nums,4);
	series(10);
	pattern1(5);
	pattern2(5);
}
}
