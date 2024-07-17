package com.demo;

public class practice {
public static void trianglesqaure(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=2*n-1;j++) {
			if(i+j>=n+1 && j-i<=n-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void trianglesqaure1(int n) {
	/*	for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
	public static void hollowtraingle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==n || i==n || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void cross(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void crossp(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==(n+1)/2 || j==(n+1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void trianglesqaurewithdash(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j==n+1 || j-i==n-1) {
					System.out.print("*");
				}
				else if(i+j>n+1 && j-i<n-1) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void trianglesqaurewithdash1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					if((i+j)%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print("-");
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void hollowsquare(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void Rhombus(int n) {
		System.out.println();
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j<=n+1 || j-i>=n-1 || i+j>=(3*n)-1 || i-j>=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void Rhombusinv(int n) {
		System.out.println();
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=3*n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void twotriangle(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j<=n+1 || i-j>=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void twotriangle2(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i-j>=0 && i+j<=2*n) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void inversetriangle(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i-j>=0 && i+j<=2*n || i+j>=2*n && j-i>=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void inversetriangle1(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i-j>=0 && i+j>=2*n || i+j<=2*n && j-i>=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void swasthik(int n) {
		
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==(n/2)+1 || i==(n/2)+1 || i==1 && j>=(n/2)+1 || j==1 && i<=(n/2)+1 || i==n && j<=(n/2)+1 || j==n && i>=(n/2)+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	public static void Aone() {
		
		for(int i=1;i<=5;i++) {
			
			int cnt2=1;
			for(int j=1;j<=i;j++) {
				if(j%2!=0) {
					System.out.print(1);
				}
				else if(j%2==0) {
					System.out.print((char)(64+cnt2));
					cnt2++;
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void Atwo() {
		
		for(int i=1;i<=8;i++) {
			
			int cnt2=i/2;
			for(int j=1;j<=i;j++) {
				if(j%2!=0) {
					System.out.print(1);
				}
				else if(j%2==0) {
					System.out.print((char)(64+cnt2--));
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void Matrix(int n) {
		
		for(int i=1;i<=n;i++) {
			int c=1;
			if(i%2!=0) {
				c=n*(i-1)+1;
			}
			else {
				c=n*i;
			}
			
			for(int j=1;j<=5;j++) {
				if(i%2!=0) {
					
					System.out.print(c++ + "\t");
				}
				else {
					System.out.print(c-- + "\t");
				}
			}
			System.out.println();
		}
	}
	public static void Matrix1(int n) {
		
		for(int i=1;i<=n;i++) {
			
			int c=(i*(i+1))/2;
			for(int j=1;j<=i;j++) {
				System.out.print(c-- + "\t");
			}
			System.out.println();
		}
	}
public static void Matrix2(int n) {
		
		for(int i=1;i<=n;i++) {
			int m=n+1-i;
			int c=(m*(m+1))/2;
			for(int j=1;j<=i;j++) {
				System.out.print(c++ + "\t");
			}
			System.out.println();
		}
	}
public static void Matrix3(int n) {
	
	for(int i=1;i<=n;i++) {
		int c=i;
		
		for(int j=1;j<=i;j++) {
			System.out.print(c + "\t");
			c+=n-j;
		}
		System.out.println();
	}
}
public static void Matrix4(int n) {
	
	for(int i=1;i<=n;i++) {
		int c=i;
		
		for(int j=1;j<=i;j++) {
			System.out.print(c + "\t");
			c+=n-j;
		}
		System.out.println();
	}
}
public static void Matrix5(int n) {
	
	for(int i=1;i<=n;i++) {
		int c=n-i+1;
		
		for(int j=1;j<=i;j++) {
			System.out.print(c + "\t");
			c=c+n-j+1;;
		}
		System.out.println();
	}
}
public static void Matrix6(int n) {
	int c=1;
	for(int i=1;i<=n;i++) {
		
		
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(c++ + "\t");
			
		}
	
		System.out.println();
	}
}

public static void Matrix7(int n) {
	int c=15;
	for(int i=1;i<=n;i++) {
		
		
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(c-- + "\t");
			
		}
	
		System.out.println();
	}
}

	public static void main(String[] args) {
		trianglesqaure(5);
		trianglesqaure1(5);
		hollowtraingle(5);
		cross(5);
		crossp(5);
		trianglesqaurewithdash(5);
		trianglesqaurewithdash1(5);
		hollowsquare(5);
		Rhombus(5);
		Rhombusinv(5);
		twotriangle(5);
		twotriangle2(5);
		inversetriangle(5);
		inversetriangle1(5);
		swasthik(7);
		Aone();
		Atwo();
		Matrix(5);
		System.out.println();
		Matrix1(5);
		System.out.println();
		Matrix2(5);
		System.out.println();
		Matrix3(5);
		System.out.println();
		Matrix4(5);
		System.out.println();
		Matrix5(5);
		System.out.println();
		Matrix6(5);
		System.out.println();
		Matrix7(5);
		
	}
}
