package Assignments;
import java.util.Scanner;
public class Push_Zero_to_end {
	
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

	public static void pushzero(int input[]) {
		int nonzero=0;
		
		for(int i=0; i<input.length;i++) {
			if(input[i]!=0) {
				int temp=input[i];
				input[i]=input[nonzero];
				input[nonzero]=temp;
				nonzero++;
			}
		}   System.out.println("After sorting:");
		for(int i=0; i<input.length;i++) {
			
			System.out.print(input[i]+ " ");
		}
	}
		
	
	
	public static void main(String[] args) {
		//You have been given a random integer array/list(ARR) of size N.
		//You have been required to push all the zeros that are present in the array/list to the end of it. 
		//Also, make sure to maintain the relative order of the non-zero elements.

		int input1[]=input();
		pushzero(input1);
		

}
}
