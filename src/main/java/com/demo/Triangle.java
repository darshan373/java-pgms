package com.demo;


public class Triangle {
    public static void pattern(int n) {
    	
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(j<=i) {
    				System.out.print(n+1-j);	
    			}
    			else {
    				System.out.print(" ");
    			}
    			
    			
    		}
    		System.out.println();
    	}
        
    }
   public static void pattern1(int n) {
    	
    	for(int i=1;i<=n;i++) {
    		for(int j=i;j>=1;j--) {
    			System.out.print(j);
    			}
    			
    		System.out.println();
    		}
    		;
    	}
   public static void pattern2(int n) {
   	
   	for(int i=1;i<=n;i++) {
   		for(int j=i;j>=1;j--) {
   			System.out.print(n-j+1);
   			}
   			
   		System.out.println();
   		}
   		;
   	}
   
   public static void pattern3(int n) {
	   int c=64;
	   	for(int i=1;i<=n;i++) {
	   		
	   		for(int j=1;j<=i;j++) {
	   			System.out.print((char)(c+i));
	   			
	   			
	   			
	   		}
	   		
	   		System.out.println();
	   	}
   }
   
   public static void pattern4(int n) {
	   
	   	for(int i=1;i<=n;i++) {
	   		int c=97;
	   		for(int j=1;j<=i;j++) {
	   			System.out.print((char)c);
	   			
	   			c++;
	   			
	   		}
	   		
	   		System.out.println();
	   	}
   }
   public static void pattern5(int n) {
	   
	   	for(int i=1;i<=n;i++) {
	   		int c=97;
	   		for(int j=i;j>=1;j--) {
	   			System.out.print((char)(c-1+j));
	   			
	   		}
	   		
	   		System.out.println();
	   	}
  }
    
   public static void pattern6(int n) {
	   
	   	for(int i=1;i<=n;i++) {
	   		
	   		for(int j=1;j<=i;j++) {
	   			System.out.print(j);
	   			
	   		}
	   		
	   		System.out.println();
	   	}
	   	System.out.println();
 }
   public static void pattern7(int n) {
	   
	   	for(int i=1;i<=n;i++) {
	   		
	   		for(int j=n-i+1;j>=1;j--) {
	   			System.out.print(j);
	   			
	   		}
	   		
	   		System.out.println();
	   	}
	   	System.out.println("               ");
}

    public static void main(String[] args) {
    	pattern(5);
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        
    }

}
