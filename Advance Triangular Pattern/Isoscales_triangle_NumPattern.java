package Advanced_Triangular_pattern;

import java.util.Scanner;

public class Isoscales_triangle_NumPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A number of rows:");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
               space++;
			}
			int j=1;
			int p=i;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			p=i-1;
		    j=1;
		    while(j<=i-1) {
		    	System.out.print(p+i-1);
		    	p--;
		    	j++;
		    }
			
			System.out.println();
			i++;
			
		}

	}
}
