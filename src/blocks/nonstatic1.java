package blocks;

public class nonstatic1 {

	nonstatic1(){      //constructor
		System.out.println("zero-param cons...");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block of class Blocks3..");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		nonstatic1 b1=new nonstatic1();
		System.out.println("---------------------------------");
		nonstatic1 b2=new nonstatic1();
		System.out.println("main() ends");
	}
}
