package Space_triangular_pattern;

import java.util.Scanner;

public class Basic_SpacePattern3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=i-n) {
				System.out.print(" ");
				space++;;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
	        i=i+1;
	}

	}

}
