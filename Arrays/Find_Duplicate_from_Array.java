package Arrays;

import java.util.Scanner;

public class Find_Duplicate_from_Array {
	
	public static int[] input(){
		System.out.println("Enter Size of Array: ");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in array: ");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;	
	}
	
	public static int duplicate(int input[]) {
		for(int i=0; i <(input.length -1); ++i) {
			for(int j=i+1; j<input.length; ++j) {
				if(input[i]==input[j]) {
					return input[i];
				}
			}
		
		}
		return Integer.MAX_VALUE;		
	}

	public static void main(String[] args) {
		int arr[]=input();
		System.out.println("duplicate element is :");
		System.out.println(duplicate(arr)) ;

	}

}
