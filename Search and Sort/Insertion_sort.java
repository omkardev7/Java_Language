package Insertion_sort;

import java.util.Scanner;

public class Insertion_sort {
	
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
	
	public static void insertion(int arr[]) {
		int i=0;
		int temp;
		while(i<arr.length) {
			temp=arr[i];
			int j=i-1;
			 while(j>=0) {
				 if(arr[j]>temp) {
					 arr[j]=arr[j+1];
				 }else {
					 break;
				 }
				 j-=1;
			 }
			 arr[j+1]=temp;
			 i+=1;
			
		}
		
	}	
	public static void print(int input[]){
		int size= input.length;
		for(int i=0;i<size;i++) {
			//System.out.println("Entered Numbers Are ");
			System.out.print(input[i] +" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans[]=input();
		insertion(ans);
		//print(ans);

	}

}
