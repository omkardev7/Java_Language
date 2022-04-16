package Functions;

import java.util.Scanner;
//these example may wrong
public class farenhit_to_celsius {
   public static int feRtoCeL(int start,int end,int gap) {
	   int f=start;
	   int c=1;
		while(f<=end) {
			c=(int)((5.0/9)*(f-32));
			System.out.println(f+ "\t" +c);
			f=f+gap;
			return c;
		}
	  return c;
				}

      
  
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		int output=feRtoCeL(i,j,k);
		//int output=feRtoCeL(c);
		System.out.println(output);
		
	}

}
