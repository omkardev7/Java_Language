package Binary_search;

import java.util.Scanner;

public class First_program {
	
	public static int[] input(){
		System.out.println("Enter Size of Array:");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in array:");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;
		  
	}
	
	/*public static int search(int num) {
		System.out.println("Enter element to Search:");
		Scanner s=new Scanner(System.in);
		 num=s.nextInt();
		 
		 return num;
	}*/
	
	
	public static int binarysearch(int input[],int num) {
		int size=input.length;
		int start=0;
		int end=size-1;
		//int mid=start;
		while(start<=end) {
		 int mid=start+(end-start)/2;
			 if(input[mid]>num) {
				end= mid-1;
				}
			 else if(input[mid]<num) {
				 start=mid+1;
			 }
			 else{
				 return mid;
			 }
			
		}  
		
		return -1;
	
		
	}

	
		
	
	public static void main(String[] args) {
		// You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'.
		//Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
        int arr[]=input();
        //int search1=search(5);
        System.out.println("Enter Number To find:");
        Scanner s=new Scanner(System.in);
        int num2=s.nextInt();
        int index = binarysearch(arr,num2);
		System.out.println("Index Where Given Number Present (Real position- 1) is "+index);
		
	}

}
