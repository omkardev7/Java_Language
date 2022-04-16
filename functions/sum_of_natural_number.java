package Functions;
import java.util.Scanner;
public class sum_of_natural_number {
	
	public class Sum_of_natural_number {
		
        public static void sumofnumber(int n) {
        	int sum=0;
    		for(int i=1; i<=n;i=i+1) {
    			 sum=sum+i;
    			
    		}
    		 System.out.println(sum);
    		}
        
		
		
		public static void main(String[] args) {
			System.out.println("Enter nmber till you want to add number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sumofnumber(n);
		

	}
	}
}



