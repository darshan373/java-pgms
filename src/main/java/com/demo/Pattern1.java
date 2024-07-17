package com.demo;

public class Pattern1 {
    public static void pattern(int n) {
    	
    	
    
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		for(int k=1;k<=n;k++) {
        			for(int l=1;l<=n;l++) {
        				/*
            			if(l%2!=0 && k%2==0 || l%2==0 && k%2!=0) {
            				System.out.print(" ");
            			}
                		
            			else {
            				System.out.print("*");
            			}*/
        				if((i+k)%2!=0) {
        					System.out.print(" ");
        				}
        				else {
        					System.out.print("*");
        				}
                	}
        			
        			
            		System.out.print(" ");
            	}
        		System.out.println();
        	}
        	System.out.println();
        }
    }
   
    
   

    public static void main(String[] args) {
        pattern(5);
    }

}