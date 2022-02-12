package If_else;

import java.util.Scanner;

public class Largest_of_Three {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		if(i>j && i>k) {
			System.out.println("greatest number is :"+i);
			return;
		}
		if(j>i && j>k)
		{
			System.out.println("greatest number is :"+j);
			
		}
		else
		{
			System.out.println("greatest number is :"+k);		}
		
	}

}
