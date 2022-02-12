
package If_else;
import java.util.Scanner;

public class salary_calculator {

	public static void main(String[] args) {
		System.out.print("Enter your Basic Salary and Grade : ");
		Scanner s=new Scanner(System.in);
	    char grade=s.next().charAt(0);
		int basic=s.nextInt();
		
		 int hra=(basic*20)/100;
		System.out.println("Your HRA is "+hra);
		 int da=(basic*50)/100;
		System.out.println("Your DA is "+da);
		 int pf=(basic*11)/100;
		System.out.println("Your Pf is  "+pf);
		 
		 if(grade=='A') {
			 int allow=1700;
			 System.out.println("Your Allowance is 1700 ");
			 int totalsalary= ((basic + da + hra + allow)-pf);
			 System.out.println("Your Total Salary  is "+totalsalary);
			
		 }
		 else if (grade=='B') {
			 int allow=1500;
			 System.out.println("Your Allowance is 1500 ");
			int totalsalary= ((basic + da + hra + allow)-pf);
			 System.out.println("Your Total Salary  is "+totalsalary);
		
		}else
		{   int allow=1300;
		 System.out.println("Your Allowance is 1300 ");
		 int totalsalary= ((basic + da + hra + allow)-pf);
			 System.out.println("Your Total Salary  is  "+totalsalary);
		 
		 }
			 
		 
		
        
	}

}
