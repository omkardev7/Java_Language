package Arrays;

import java.util.Scanner;

public class Unique_number {
	
	

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
	public static int findunique(int input[]){
		for(int i=0; i<input.length; i++ ) {
			int j;
			for( j=0; j<input.length; j++) {
				if(i !=j) {
					if(input[i]==input[j]) {
						break;
					}
				}
			}
			if(j==input.length) {
					return input[i];
				}
			}
		return Integer.MAX_VALUE; 
		}
		 
	

	public static void main(String[] args) {
		// Given an integer array of size 2N + 1. In this given array, N numbers are
		//present twice and one number is present only once in the array. You need to find and return that
			//	number which is unique in the array.

		int arr[]=input();
		System.out.println("Unique elements :");
		System.out.println(findunique(arr)) ;
		
	}

}
