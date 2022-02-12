import java.util.Scanner;
public class checknumbersareequal {

	public static void main(String[] args) {
		System.out.println("Enter two numbers to check :");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
	    boolean check = (i==j);
	    System.out.println(check);
		
	}

}
