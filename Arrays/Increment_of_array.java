package Arrays;

import java.util.Scanner;

public class Increment_of_array {
	

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
	
	public static void print(int input[]){
		int size= input.length;
		System.out.println("Entered Numbers afte Increment Are ");
		for(int i=0;i<size;i++) {
			//System.out.println("Entered Numbers Are ");
			System.out.print(input[i] +" ");
		}
		System.out.println();
	}

	
	public static void increment(int input[]) {
		int size=input.length;
		for(int i=0; i <size ;i++ ) {
	       input[i]++;		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= input();
		increment(arr);
	    print(arr);

	}

}
