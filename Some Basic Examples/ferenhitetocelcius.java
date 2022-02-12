import java.util.Scanner;
public class ferenhitetocelcius {

	public static void main(String[] args) {
		System.out.println("Enter farenhite value:  ");
		Scanner s= new Scanner(System.in);
		double f=s.nextDouble();
		int c= (int)((5.0/9)*(f - 32));
		System.out.println(c);
		
		

	}

}
