package Assignments;

import java.util.Scanner;

public class sort_0_1_2 {
	public static int[] input() {
		System.out.println("Enter Size of Array:");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter elements of array:(only 0,1,2)");
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void sort(int input[]) {
		int nextzero=0;
		int nexttwo=input.length-1;
		int i=0;
		while(i<=nexttwo) {
			if(input[i]==0) {
				int temp=input[nextzero];
				input[nextzero]=input[i];
				input[i]=temp;
				i++;
				nextzero++;	
			}else if(input[i]==2) {
				int temp=input[nexttwo];
				input[nexttwo]=input[i];
				input[i]=temp;
				nexttwo--;	
			}
			else {
				i++;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		//You are given an integer array containing only 0s, 1s and 2s.
		//Write a solution to sort this array using one scan only.
      int input[]=input();
      sort(input);
	}

}
