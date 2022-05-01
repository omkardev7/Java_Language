package Arrays;

import java.util.Scanner;

public class Sum_of_array {

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
		System.out.println("Entered Numbers Are ");
		for(int i=0;i<size;i++) {
			//System.out.println("Entered Numbers Are ");
			System.out.print(input[i] +" ");
		}
		System.out.println();
	}
	
	public static int sum(int input[]) {
		int size=input.length;
		int ans=0;
		for(int add=0;add<size;add++) {
			ans += input[add];
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[]=input();
		print(arr);
		System.out.println("Sum of numbers in array: "+sum(arr));

	}

}
