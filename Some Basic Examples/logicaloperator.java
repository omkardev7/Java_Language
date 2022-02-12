import java.util.Scanner;

public class logicaloperator {

	public static void main(String[] args) {
		System.out.println("Enter three numbers to compare :");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		boolean z=((i>j)&&(i>k));
		System.out.println("is first number biggest?:"+z);
		boolean o=((i>j)||(i>k));
		System.out.println("is first number greater than any other number?:"+o);
		
		
	}

}
