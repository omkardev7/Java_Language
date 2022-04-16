package Functions;
import java.util.Scanner;
public class Square_root_of_number {
	
	public static void squareroot(int n) {
		int i=0;
	    //int sqaureroot=0;
	    while(i*i<=n)
	    {
	    	i=i+1;
	     
	    	
	    }
	    System.out.println(i-1);
	}
	public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
	System.out.println("Enter a number");
  	int n=s.nextInt();
  
  	squareroot(n);
    
}
}
