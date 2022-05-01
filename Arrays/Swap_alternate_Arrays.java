package Arrays;

import java.util.Scanner;

public class Swap_alternate_Arrays {

	public static void printarr(int input[] ) {
		System.out.println("After Swapping:");
		for (int i=0; i<input.length ; i++) {
			System.out.print(input[i] +" ");
		}
	}
	
	public static int[] input() {
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
	
	public static void swap(int input[]) {
		for(int i=0; i<(input.length-1);i+=2) {
			  int arr=input[i];
			  input[i]=input[i+1];
			  input[i+1]=arr;
			
			  
		}  
		printarr(input);
	}
	
	public static void output() {
		
	}
	
	
	public static void main(String[] args) {
        int ans[]=input();	
        
        swap(ans) ;

	}

}
