package Assignments;

import java.util.Scanner;

public class Find_largest_element {
	public static int[] input() {
		System.out.println("Enter Size of Array:");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter elements of array:");
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static int secondlargest(int input[]) {
		if(input.length==0) {
			return Integer.MIN_VALUE;
		}
		int largest=input[0]; int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(largest<input[i]) {
				secondlargest=largest;
				largest=input[i];
			}
			else if(secondlargest<input[i]&&input[i]!=largest) {
				secondlargest=input[i];
			}
		}
		
		return largest;
	}
	

	public static void main(String[] args) {
		// You are given an array of integers and you have to find the  largest element present in the given array.

		int input1[]=input();
		 System.out.println("Largest element is ");
	     System.out.println(secondlargest(input1));
	}

}
