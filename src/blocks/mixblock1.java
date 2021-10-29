package blocks;

public class mixblock1 {
	static int age=25;
	double salary=15000.57;
	
	/* static block or SIB*/
	static {		
		age=30;		
	}
	/* non-static block or IIB*/
	{
		salary=45000.32;
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: "+mixblock1.age);
		System.out.println("---------------------------------");
		mixblock1 b1=new mixblock1();
		System.out.println("salary: "+b1.salary);
		System.out.println("main() ends..");
	}
}



