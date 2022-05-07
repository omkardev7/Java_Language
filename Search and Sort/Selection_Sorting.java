package Binary_search;

import java.util.Scanner;

public class Selection_Sorting{
	
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
	 public static void selection(int input[]) {
	   int size= input.length;
	   for(int i=0; i<size-1; i++) { 
		 //loop is for sorting elements from start(sort from fist element)
		   int min=input[i];
		   int minIndex=i;
		   for(int j=i+1; j<size;j++) { 
			 //loop on array is for comparision of elements other than sorted elements after first loop
			     {
				   //swap
				   min=input[j];
				   minIndex=j;
			   } 
		   }
			   if(minIndex != i) {
				   //storing min value at index[i]
			   input[minIndex]=input[i];
			   input[i]=min;
			   }
		    }
			  
		   
	   }	

	public static void main(String[] args) {
	    int input[]= input();
	    selection(input);
		System.out.println("After Sorting:");
	    for(int i=0; i<input.length; i++) {
	    
	    	System.out.print(input[i]+" ");
	    }
	    

	}

}
