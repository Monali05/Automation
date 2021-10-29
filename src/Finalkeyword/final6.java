package Finalkeyword;

public class final6 {
	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
		   //n=n+2;//can't be changed as n is final  
		   return n*n*n;  
		  }


public static void main(String args[]) {
	final6 b = new final6();
	System.out.println(b.cube(5));
}
}