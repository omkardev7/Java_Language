import java.util.Scanner;
public class Relationoperator {

	public static void main(String[] args) {
		System.out.println("Enter two numbers to check :");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
	    boolean equal = (i==j);
	    boolean unequal=(i!=j);
	    boolean greater=(i>j);
	    boolean lesser=(i<j);
	    
	    System.out.println(" is they are eqaul :"+equal);
	    System.out.println(" is they are not eqaul :"+unequal);
	    System.out.println(" does first number is greater than second:"+greater);
	    System.out.println(" does first number is lesser than second :"+lesser);
	    
		
	}

}
