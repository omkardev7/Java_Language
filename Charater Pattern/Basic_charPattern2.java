package Character_pattern;

import java.util.Scanner;

public class Basic_charPattern2 {

	
		

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter a number of rows :");
			int n=s.nextInt();
			int i=1;
			while(i<=n) {
				int j=1;
				char startchar=(char)('A'+i -1);
				while(j<=n) {
					System.out.print(startchar);
					startchar=(char)(startchar+1);
					j=j+1;
				}
				System.out.println();
				i=i+1;
			}

		}
	}


