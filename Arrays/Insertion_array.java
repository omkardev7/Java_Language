package Arrays;

import java.util.Scanner;

public class Insertion_array {
	
	public static int[] input(){
		System.out.println("Enter Size of 1st Array: ");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in 1st array: ");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;	
	}
	
	public static int[] input2(){
		System.out.println("Enter Size of 2nd Array: ");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in 2nd array: ");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;	
	}
	
	public static void printarr(int input[] ) {
		System.out.println();
		System.out.println("Entered elements are :");
		for (int i=0; i<input.length ; i++) {
			System.out.print(input[i] +" ");
		}
	}
	
	public static void intersection(int input[], int input1[]) {
		System.out.println();
		System.out.println("Insertion  elements are:");
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input1.length; j++) {
				
				if(input[i]==input1[j]) {
					//System.out.println();
						System.out.print(input[i]+" ");
					input1[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		//In this problem you are given with two random integer arrays, you have
		//to print their intersection. That is, you have to print all the elements that are present in both the
		//given arrays.
		
		
		int arr[]=input();
		int arr2[]=input2();
	    printarr(arr);
	    printarr(arr2);
	    intersection(arr,arr2);
	}

}
