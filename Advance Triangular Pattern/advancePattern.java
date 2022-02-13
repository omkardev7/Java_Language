package Advanced_Triangular_pattern;

public class advancePattern {

	public static void main(String[] args) {
		int i=1,k=6,l=13,m=16;
		while(i<=5) {
			int j=1;
			while(j<=5) {
			 if(i==1) {
				 //int j=1;
				 System.out.print(j);
				 //System.out.print(" ");
			 } 
		  // int j=1;
			 if(j==5) {
				 
				 System.out.print(k++);
				 k++;
				 //System.out.print("");
			 }
			 if(i==5) {
				 System.out.print(i--);
				 i--;
				 //System.out.print("");
			 }
			 if(j==1) {
				 System.out.print(m--);
				 m--;
				 //System.out.print("");
			 }
			 else {
				 System.out.print("");
			 }
		j++;
			 
			 System.out.println();
			
			 i++;
		}
		}			

	}
}

