import java.util.Scanner;
public class Averageofthreetests {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String str;
		str=s.nextLine();
		 System.out.println("Enter Marks of Three Subjects: ");
         int i=s.nextInt();
         int j=s.nextInt();
         int k=s.nextInt();
         int z=(i+j+k)/3;
         System.out.print("Your Name Is ");
         System.out.println(str);
         System.out.println("Average Of 3 Subjects is  ");
         System.out.println(z);
    
		
		
		
	}

}
