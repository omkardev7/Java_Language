package triangular_pattern;

import java.util.Scanner;

public class Basic_pattern4 {

	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			//here we printing stars in triangular pattern
			System.out.println("Enter a no. of rows you want:");
			int n=s.nextInt();
			int i=1;
			while(i<=n) {
				int j=1;
				
				while(j<=i) {
					System.out.print("*");
					
					j=j+1;
				}
				System.out.println();
				i=i+1;
			}

		}


	}


