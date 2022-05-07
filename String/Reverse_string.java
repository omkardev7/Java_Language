package Basics;
import java.util.Scanner;;
public class Reverse_string {
	
	public static String reverse(String input) {
		int i=input.length()-1;
		int end=input.length();
		String output=" ";
		while(i>=0) {
		  	if(input.charAt(i)==' ') {
		  		output=output+input.substring(i+1, end)+ " ";
		  		end=i;
		  	}
		  	i--;
		}
		output+=input.substring(i+1,end);
		return output;
		
	}

	public static void main(String[] args) {
		// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. 
		//Individual words should remain as it is.
     	System.out.println("enter your words: ");
        Scanner s=new Scanner(System.in);
        String inp=s.nextLine();
        reverse(inp);
	}

}
