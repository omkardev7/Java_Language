package Functions;
import java.util.Scanner;
public class fibanacci_number {
 public static boolean checkmember(int n) {
	 int a=0;
	 int b=1;
	 int c;
	 while(a<n) {
		 c=a+b;
		 a=b;
		 b=c;
	 }
	 if(a==n) {
		 return true;
	 }
	 else {
		 return false;
	 }
	
 }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		boolean result=checkmember(n);
         System.out.println(result);
	}

}
