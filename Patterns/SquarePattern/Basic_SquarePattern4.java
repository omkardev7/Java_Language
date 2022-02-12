package Square_Patterns;
import java.util.Scanner;
public class Basic_SquarePattern4 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		  //number of rows is equal to number of column and printing digit same in row(reverse)
		 System.out.println("Enter number of rows (row=column):");
	     int n=s.nextInt();
	     int i=1;
	     while(i<=n) {
	    	 int j=1;
	    	 while(j<=n) {
	    	 System.out.print(n-i+1);
	    	 j=j+1;
	    	 }
	    	 System.out.println();
	    	 i=i+1;
	     }
	}
}
