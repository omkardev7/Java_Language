package Basics;
import java.util.Scanner;
public class print_all_substring {
	
	public static void substring() {
		Scanner s=new Scanner(System.in);
	     String str=s.nextLine();    
		for(int i=0; i<str.length();++i) {
			for(int j=i;j<str.length();++j) {
				for(int k=i; k<=j; ++k) {
		   System.out.print(str.charAt(k) );
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) { 
		//For a given input string(str), write a function to print all the possible substrings.
		//Scanner s=new Scanner(System.in);
	    //String
        substring();
	}

}
