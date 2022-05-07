package Basics;

import java.util.Scanner;

public class substring_2 {
	
	public static void prefix(String str) {
		for(int i=0; i<str.length();i++) {
			System.out.println(str.substring(0, i));
		}
		
	}

	public static void main(String[] args) {
		// these is 2nd method to find substring
		Scanner s=new Scanner(System.in);
		System.out.println("Enter characters in string: ");
		String str1=s.nextLine();
		prefix(str1);
       
	}

}
