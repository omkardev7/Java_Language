package Operators;

public class Increment_And_Decreament {

	public static void main(String[] args) {
		int a=1;
		
		System.out.println("Post increment:");//first print then increase value 
		System.out.println(a++);
		
		a=5;
		System.out.println("Pre increment:");//first increase value then print
		System.out.println(++a);
		
		a=11;
		System.out.println("Post decrement:");
		System.out.println(a--);
		
		a=15;
		System.out.println("Pre increment:");
		System.out.println(--a);
	}

}
