package Functions;

import java.util.Scanner;

public class selection_nCr {
	public static int factorial(int n) {
		int ans=1;
		for(int i=1; i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter total numbers and selection required:");
        int n=s.nextInt();
        int r=s.nextInt();
        
        int numrator=factorial(n);
        int denominator1=factorial(r);
        int denominator2=factorial(n-r);
        int ans1= numrator / (denominator1*denominator2);
        if(ans1>0) {
              System.out.println("required result is");
             System.out.println(ans1);
        }
       
	}

}
