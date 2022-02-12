package Square_Patterns;
import java.util.Scanner;
public class Basic_SquarePattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n);
				j=j+1;
			}
			System.out.println();
	        i=i+1;
	}

	}
}
