package com.demo;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProblems {
public static void right(int[] arr,int k) {
	for(int j=1;j<=k%arr.length;j++) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			
			
		}
		arr[0]=temp;
	}
}
public static void left(int[] arr,int k) {
	for(int i=1;i<=k%arr.length;i++) {
		int temp=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];	
		}
		
		arr[arr.length-1]=temp;
	}
}
public static void replace(int[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0 && arr[i]%8==0) {
			arr[i]=-3;
		
		}
		else if(arr[i]%2==0) {
			arr[i]=-1;
			
		}
		else if(arr[i]%8==0) {
			arr[i]=-2;
			
		}
		
			}
	
	
	
}
public static void replacelastdigit(int[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		if((arr[i]/10)%10==2 && arr[i]%10==1) {
			arr[i]=-3;
		
		}
		else if(arr[i]%10==1) {
			arr[i]=-1;
			
		}
		else if((arr[i]/10)%10==2) {
			arr[i]=-2;
			
		}
		
			}
}
public static void countevenodd(int[] arr) {
	int even=0;
	int neg=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		even++;
	}	
	if(arr[i]<0) {
		neg++;
	}
			}
	int odd=arr.length-even;
	System.out.println("Even:"+even+"\t odd:"+odd+"\tNegative :"+neg);
	
}
public static void reverse(int[] arr) {
	int start=0;
	int last=arr.length-1;
	while(start<last) {
		arr[start]=arr[start]+arr[last];
		arr[last]=arr[start]-arr[last];
		arr[start]=arr[start]-arr[last];
		start++;
		last--;
		
	}
	
}
public static void maxmin(int[] arr) {
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
		sum+=arr[i];
	}
	System.out.println("MAX:"+max+"\t MIN:"+min+"\t SUM:"+sum);
}
public static void smax(int[] arr) {
	int max=Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			smax=max;
			max=arr[i];
		}
		else if(arr[i]>smax && arr[i]<max) {
			smax=arr[i];
		}
	
	}
	System.out.println("SECOND MAX:"+smax+"\t MAX:"+max);
}
public static void insertarr(int[] arr,int k) {
	int[] arr1=new int[arr.length+1];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
	}
	arr1[arr1.length-1]=k;
	System.out.println(Arrays.toString(arr1));
	
}
public static void insertarratbig(int[] arr,int k) {
	int[] arr1=new int[arr.length+1];
	arr1[0]=k;
	for(int i=0;i<arr.length;i++) {
		arr1[i+1]=arr[i];
	}

	System.out.println(Arrays.toString(arr1));
	
}
public static void deletearr(int[] arr) {
	int[] arr1=new int[arr.length-1];
	for(int i=0;i<arr.length-1;i++) {
		arr1[i]=arr[i];
	}
	
	System.out.println(Arrays.toString(arr1));
	
}
public static void deletearratbig(int[] arr) {
	int[] arr1=new int[arr.length-1];
	
	for(int i=1;i<arr.length;i++) {
		arr1[i-1]=arr[i];
	}
	
	System.out.println(Arrays.toString(arr1));
	
}
public static void Bubblesort(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
}
public static void freq(int[] arr) {
	Bubblesort(arr);
	
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			
			count++;
		}
		else {
			
			System.out.println(arr[i]+":"+ ++count);
			count=0;
		}
		
	}
	System.out.println(arr[arr.length-1]+":"+ ++count);
}
public static void merge(int[] arr,int[] arr1) {
	
	int[] merge=new int[arr.length+arr1.length];
	int i=0,j=0;
	int k=0;
	while(i<arr.length && j<arr1.length) {
		if(arr[i]<=arr1[j]) {
			merge[k++]=arr[i++];
		}
		else {
			merge[k++]=arr1[j++];
		}
	}
	
	while(i<arr.length) {
		merge[k++]=arr[i++];
	}
	while(j<arr1.length) {
		merge[k++]=arr1[j++];
	}
	System.out.println(Arrays.toString(merge));
}
public static void dupli(int[] arr) {
Bubblesort(arr);
	
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			
			count++;
		}
		else {
			if(++count>1) {
				System.out.println(arr[i]);
			}
			
			count=0;
		}
		
	}
	if(count>0) {
		System.out.println(arr[arr.length-1]);
	}
	
}
public static void evenodd(int[] arr) {
	int even=0,odd=0;
	for(int num:arr) {
		if(num%2==0) {
			even++;
		}
		else {
			odd++;
		}
	}
	int[] e=new int[even];
	int[] o=new int[odd];
	int i=0,j=0;
	for(int num:arr) {
		if(num%2==0) {
			e[i++]=num;
		}
		else {
			o[j++]=num;
		}
	}
	System.out.println(Arrays.toString(e));
	System.out.println(Arrays.toString(o));
	
}
public static void deleteatindex(int[] arr,int k) {
	int[] b=new int[arr.length-1];
	System.arraycopy(arr,0,b,0,k);
	System.arraycopy(arr,k+1,b,k,arr.length-1-k);
	System.out.println(Arrays.toString(b));
}
public static int firstduplicate(int[] arr) {
	int flag=0;
	for(int i=0;i<arr.length;i++) {	
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				flag=1;
				System.out.println(arr[i]);
				if(flag==1) {
					break;
				}
				
			}
			if(flag==1) {
				break;
			}
		}
	}
	return -1;
}
public static int firstduplicate1(int[] arr) {
	int flag=0;
	for(int i=0;i<arr.length;i++) {	
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				flag=1;
				System.out.println(arr[i]);
				System.exit(0);
				
			}
			
		}
	}
	return -1;
}
public static void commonelesort() {
	
	int[] arr1= {1,3,4,6,7,7,10};
	int[] arr2= {1,2,5,7,8,10};
	int[] arr3= {1,3,7,8,9,10};
	int i=0,j=0,k=0;
	while(i<arr1.length && j<arr2.length && k<arr3.length) {
		if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
			System.out.println(arr1[i]);
			i++;
			j++;
			k++;
			
		}
		else if(arr1[i]<arr2[j]) {
			i++;
		}
		else if(arr2[j]<arr3[k]) {
			j++;
		}
		else if(arr3[k]<arr1[i]) {
			k++;
		}
		
	}
	
}
public static void commonele() {
	
	
	int[] arr1= {1,2,5,7,8,10};
	int[] arr2= {1,3,7,8,9,10,12,13,14};
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
			}
		}
	}
		
}
public static void kadane() {
	int[] arr= {1,-3,0,5,6,-5,4,-1,3,-1,-1,-1};
	int curmax=0,max=0;
	int startindex=0,endindex=0;
	for(int i=0;i<arr.length;i++) {
		
		curmax+=arr[i];
		
		if(max<curmax) {
			max=curmax;
			endindex=i;
		}
		if(curmax<0) {
			curmax=0;
			startindex=i+1;
		}
	}
	System.out.println(max);
	System.out.println("Start:"+startindex+"\t End:"+endindex);
}
public static int naturalsum(int n) {
	return n*(n+1)/2;
}
public static void missingele() {
	int[] arr= {2,4,5,6,7,8,9};
	int sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	
	for(int num:arr) {
		sum+=num;
		if(num>max) {
			max=num;
		}
		if(num<min) {
			min=num;
		}
	}
	int sum1=naturalsum(max)-naturalsum(min-1);
	int ans=sum1-sum;
	System.out.println("Missing Number: "+ans);
	
}
public static void singleele() {
	int[] nums= {1,1,2,3,2,3,4,5,6,4,5};
	int ans=nums[0];
	for(int i=1;i<nums.length;i++) {
		ans^=nums[i];
	}
	System.out.println(ans);
}
public static void longestsubarray() {
	int[] nums= {1,2,3,4,5,6,2,3};
	int target=11;
	int max=0;
	for(int i=0;i<nums.length;i++) {
		int sum=0;
		int max1=0;
		for(int j=i;j<nums.length;j++) {
			
			sum+=nums[j];
			
			if(sum==target) {
				max1=j-i+1;
				if(max<max1) {
					max=max1;
				}
			}
			
		}
	}
	System.out.println("longest subarray sum:\t"+max);
}
public static void swap(int[] nums,int s,int e) {
	int temp=nums[s];
	nums[s]=nums[e];
	nums[e]=temp;
}
public static void dutchnationalflag() {
	int[] arr= {0,0,1,2,1,1,0,2,2,0,1,2,0,0,1};
	int low=0,mid=0,high=arr.length-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[mid]==0) {
			swap(arr,low,mid);
			low++;
			mid++;
		}
		else if(arr[mid]==1) {
			mid++;
		}
		else {																																													
			swap(arr,mid,high);
//			mid++; //donot increment mid we need to check it when this step is over
			high--;
		}
		
	}
	
	System.out.println(Arrays.toString(arr));
}
public static void majorityele() {
	int[] arr= {1,1,1,3,2,5,6,1,1,1,4};
	int count=1; int ele=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(count==0) {
			ele=arr[i];
			count++;
		}
		else if(ele==arr[i]) {
			count++;
		}
		else {
			count--;
		}
	}
	 count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==ele) {
			count++;
		}
	}
	if(count>(arr.length/2)) {
		System.out.println(ele);
		
	}
	else {
		System.out.println("No majority");
	}
	
}
public static void rearrange() {
	int[] arr= {3,5,-1,-4,2,-3};
	int[] newarr=new int[arr.length];
	int odd=0,even=1;
	for(int num:arr) {
		if(num>=0) {
			newarr[odd]=num;
			odd+=2;
		}
		else {
			newarr[even]=num;
			even+=2;
		}
	}
	System.out.println(Arrays.toString(newarr));
}
public static void leader() {
	int[] arr= {4,13,4,2,6,5,1};
	int count=0;
	int max=Integer.MIN_VALUE;
	for(int i=arr.length-1;i>=0;i--) {
		if(max<arr[i]) {
			max=arr[i];
			count++;
			System.out.println(max);
		}
		
	}
	System.out.println("No of leader:"+count);
}
public static void shifttenlast() {
	int[] arr= {10,45,10,10,87,45,96,23,78,10};
	int last=arr.length-1;
	int start=0;
	while(start<=last) {
		if(arr[last]==10) {
			last--;
			
		}
		if(arr[start]==10) {
			swap(arr,start,last);
			start++;
			last--;
		}
		else {
			start++;
		}
		
	
		
	}
	System.out.println(Arrays.toString(arr));
}
public static void shifttenlast1() {
	int[] arr= {10,45,10,10,87,45,96,23,78,10};
	int pointer=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=10) {
			swap(arr,i,pointer);
			pointer++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
public static void rotatearray() {
	int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	System.out.println("given array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(+arr[i][j]+"\t");
		}
		System.out.println();
	}
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i;j<arr.length;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length/2;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[i][arr.length-j-1];
			arr[i][arr.length-j-1]=temp;
		}
	}
	System.out.println("Rotated array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(+arr[i][j]+"\t");
		}
		System.out.println();
	}
}
public static void spiralwayprint() {
	System.out.println("Enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[][]=new int[size][size];
	int minrow=0;
	int maxrow=size-1;
	int mincol=0;
	int maxcol=size-1;
	int count=1;
	while(count<=size*size) {
		for(int i=mincol;i<=maxcol;i++) {
			arr[minrow][i]=count;
			count++;
		}
		for(int i=minrow+1;i<=maxrow;i++) {
			arr[i][maxcol]=count;
			count++;
			
		}
		for(int i=maxcol-1;i>=mincol;i--) {
			arr[maxrow][i]=count;
			count++;
		}
		for(int i=maxrow-1;i>=minrow+1;i--) {
			arr[i][mincol]=count;
			count++;
		}
		minrow++;
		maxrow--;
		mincol++;
		maxcol--;
	}
	System.out.println("given array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(+arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	
}
public static boolean jumpgame() {
	int[] nums= {1,2,3,4,5,6};
	int reach=0;
	for(int i=0;i<nums.length;i++){
	    if(i>reach) return false;
	    reach=Math.max(reach,i+nums[i]);
	}
	return true;
}
public static void main(String[] args) {
	
	
	if(jumpgame()) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
}
}





























 






















































































































































































































































































































































































































