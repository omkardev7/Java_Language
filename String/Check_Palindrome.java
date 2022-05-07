package Basics;

import java.util.Scanner;

public class Check_Palindrome {
	public static boolean checkpalindrome(String input) {
		int i=0;
		int j=input.length()-1;
		
		while(i<j) {
			if(input.charAt(i)!=input.charAt(j)) {
				 
              return false;		
            
			}
			else {
				
				i++;
				j--;
				
			}
		}
		    return true;	
	}
	
	public static void main(String[] args) {
		//Given a string, determine if it is a palindrome, considering only alphanumeric characters.
		//A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
		System.out.println("Enter a string to check to whether it is palindrome or not: ");
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       
        System.out.println(checkpalindrome(str));

	}

}
