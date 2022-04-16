package Functions;

import java.util.Scanner;

public class Print_prime_numbers {
	public static boolean checkprime(int n) {
		   for(int d=2; d<n;d++) {	
			   if(n%d==0) {
				return false;
			   }
			 
			  }
		   return true;
		}

	public static void printprime(int n) {
		for(int i=2;i<=n;i++) {
			boolean Prime=checkprime(i);
			if(Prime) {
				System.out.println(i);
				//return i;
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
         printprime(n);
         }

}
