package Basics;

import java.util.Scanner;

public class Word_count {
	
	public static int count(String input) {
		 int wordcount=0;
		 for(int i=0;i<input.length();i++) {
			 if(input.charAt(i)== ' ') {
				 wordcount++;			 
			 }
			 
		 }
		 wordcount++;
		 return wordcount;
	}

	public static void main(String[] args) {
		// For a given input string(str), find and return the total number of words present in it.
		System.out.println("Enter a string ");
		Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       
     System.out.println("Word Count is "+count(str));
	}

}
