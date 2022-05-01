package Arrays;
import java.util.Scanner;
public class Input_Print_Array {

	public static void main(String[] args) {
		  
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter Size of Array:");
		  int size=s.nextInt();//taking input of size from user
		  int input[]=new int[size]; //creating array of size given by user
		  for(int i=0;i<size;i++) {
			 input[i]=s.nextInt(); //taking input from user for array
			 System.out.println(input[i]); //pring stored array values
		  }
		  
		  
	}

}
