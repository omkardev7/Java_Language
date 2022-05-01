package Arrays;

import java.util.Scanner;

public class Largest_of_number {


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
	
	public static int largestcheck(int input[]) {
		int max=0;
		int size=input.length;
		for(int i=0; i<size ;i++) {
			if(input[i]>max) {
				max=input[i];
			}
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]=input(); // giving all enterd values at upper function to arr[] array
       print(arr);
       int largest=largestcheck(arr); // calling largestcheck function and storing in largest variable
       System.out.println("Largest number is "+largest);
	}


}
