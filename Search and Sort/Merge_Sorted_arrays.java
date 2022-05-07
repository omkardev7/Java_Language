package Merge_sorted_array;
import java.util.Scanner;
public class Merge_Sorted_arrays {
	
	public static int[] input1(){
		System.out.println("Enter Size of 1st Array:");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in array:");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;	  
	}
	
	public static int[] input2(){
		System.out.println("Enter Size of 2nd Array:");
		 Scanner s=new Scanner(System.in);
		  int size=s.nextInt();
		  System.out.println("Enter Numbers in array:");
		  int input[]=new int[size];
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt();
		  }
		  return input;	  
	}
	
	public static int[] merge(int input1[] , int input2[]) {
		int size= input1.length+input2.length;
		int arr[]= new int[size];
		int i=0,j=0,k=0;
		
		while(i<input1.length&&j<input2.length) {
			if(input1[i]<input2[j]) {
				arr[k]=input1[i];
				k+=1;
				i+=1;
			}
			else {
				arr[k]=input2[j];
				k+=1;
				j+=1;
			}
		}
		 while(i<input1.length) {
					arr[k]=input1[i];
					k+=1;
					i+=1;
		 }
		 while(j<input2.length) {
			 arr[k]=input2[j];
				k+=1;
				j+=1;
		 }
		return arr;	 
		
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=input1();
		int arr1[]=input2();
		int ans[]=merge(arr,arr1);
		print(ans);
		
	}
}
