package Arrays;

import java.util.Scanner;

public class Linear_Search_array {
	
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
	
	
	public static int search(int arr[], int val) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//'Linear search' is a method for finding an element within an array/list.
		//It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched
		
		System.out.println("number 5 present at these index is " +search(input(),5));
		
		
	}

}
