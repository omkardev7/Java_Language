package triangular_pattern;

import java.util.Scanner;

public class Basic_pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//here we printing next number to next row(reverse order)
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int startnum=i;
			while(j<=i) {
				System.out.print(startnum);
				startnum--;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}
}


