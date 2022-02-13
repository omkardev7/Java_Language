package Character_pattern;

import java.util.Scanner;

public class Basic_charPattern1 {
	

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			//here we printing next charecter to next colume
			System.out.println("Enter a number:");
			int n=s.nextInt();
			int i=1;
			while(i<=n) {
				int j=1;
				
				while(j<=n) {
					System.out.print( (char)('A' + j -1));
				
					j=j+1;
				}
				System.out.println();
				i=i+1;
			}

		}
}


