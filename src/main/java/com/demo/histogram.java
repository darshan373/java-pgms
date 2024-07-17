package com.demo;

public class histogram {

	public static int countdigits(int n) {
		int temp=n;
		int c=0;
		while(temp!=0) {
			c++;
			temp/=10;
			
		}
		return c;
		
	}
	public static int maxdigits(int n) {
		int temp=n;
		int max=0;
		while(temp!=0) {
			int digit=temp%10;
			max=Math.max(max,digit);
			temp/=10;
			
		}
		return max;
		
	}
	static int digit(int n,int j) {
		int digit=0;
		digit=n/(int)Math.pow(10,countdigits(n)-j);
		return digit%10;
	}
	public static void histogram1(int n) {
	
		for(int i=1;i<=maxdigits(n);i++) {
			for(int j=1;j<=countdigits(n);j++) {
			if(maxdigits(n)-digit(n,j)>=i) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int n=46973;
		
		histogram1(n);
	
		
	}
}
