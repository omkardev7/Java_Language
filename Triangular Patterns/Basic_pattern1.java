package triangular_pattern;
import java.util.Scanner;
public class Basic_pattern1 {

	public static void main(String[] args) {
		
				Scanner s=new Scanner(System.in);
				System.out.print("Enter a number:");
				int n=s.nextInt();
				int i=1;
				while(i<=n) {
					int j=1;
					while(j<=i) {
						System.out.print(j);
						j=j+1;
					}
					System.out.println();
					i=i+1;
				}

			}

		


	}


