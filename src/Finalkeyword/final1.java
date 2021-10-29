package Finalkeyword;

public class final1 {
	final int speedlimit;// blank final variable
	final1() {
		speedlimit = 70;
		
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		final1 f1=new final1();
		System.out.println(f1.speedlimit); 
	}
}

