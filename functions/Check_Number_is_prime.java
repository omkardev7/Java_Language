package Functions;
import java.util.Scanner;
public class Check_Number_is_prime {
	
	public static boolean checkprime(int n) {
	   for(int d=2; d<n;d++) {	
		   if(n%d==0) {
			return false;
		   }
		 
		  }
	   return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		boolean ans=checkprime(n);
		System.out.println(ans);
        
	}

}
