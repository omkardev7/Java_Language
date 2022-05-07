package Basics;

public class string_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefgh";
		System.out.println(str);//print string
	    System.out.println(str.charAt(3));//correct
	    //System.out.println(str[0]);//wrong
        System.out.println(str.substring(1,5));//defining substring
        System.out.println(str.substring(0));
        String str1="";
        System.out.println(str.length());//length
        System.out.println(str1.length());
        System.out.println(str.contains("efgh"));//for checking wheather element present or not
	}

}
