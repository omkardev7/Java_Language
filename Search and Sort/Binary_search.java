package Binary_search;

import java.util.Scanner;

public class Binary_search {
	
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
	
	public static int binarysearch(int input[],int element) {
		int start=0;
		int end=input.length-1;
		
		while(start<=end) {
			//to find middle element
			int mid=(start+end)/2;
			if(element==input[mid]) {
				//
				return mid;
				
			}
			else if(element>input[mid]) {
				// if current element is bigger than middle then update start of comparision 
				start=mid+1;
				
			}
			else {
				// if current element is lesser than middle then update end of comparision 
				end=mid-1;
			}
		} return -1;  
	}
	
	
    public static int element() {
    	System.out.println("Enter Element to find: ");
    	Scanner s=new Scanner(System.in);
    	int i=s.nextInt();
    	return i;
    }
    
    
	public static void main(String[] args) {
		int arr[]=input();
		int element=element();
		//System.out.println("Enter Element to find: ");
    	//Scanner s=new Scanner(System.in);
    	//int i=s.nextInt();
		int index=binarysearch(arr,element);
        System.out.println("Element Present At index "+index);
	}

}
