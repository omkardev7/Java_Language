package Basics;
import java.util.Scanner;
public class String_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter first string: ");
       String str= s.nextLine();
       System.out.println("enter second string: ");
       String str2=s.nextLine();
       
       if(str == str2) {
    	   System.out.println("Equal");
    	   System.out.println(str);
    	   System.out.println(str2);
       }else {
    	   System.out.println("unequal");
    	   System.out.println(str);
    	   System.out.println(str2);
       }
	}

}
