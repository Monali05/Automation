package constructor;

public class withparameter {
		double i = 10.23;

		withparameter(double j) {
			System.out.println("Running Class C constructor..");
			i = j;
		}
	

public static void main(String args[]) {
	System.out.println("Main() of Class Cons5 is started...");
	withparameter b1 = new withparameter(15.34);
	System.out.println("Class C global varibale i = " + b1.i);//15.34
	System.out.println("======================================");
	withparameter b2 = new withparameter(45.32);
	System.out.println("Class C global varibale i = " + b2.i);//45.32
	System.out.println("Main() of Class Cons5 is ends here...");
}
}
