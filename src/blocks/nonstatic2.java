package blocks;

public class nonstatic2 {

	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
	nonstatic2 p=new nonstatic2();
		System.out.println("---------------------------------");
		nonstatic2 p1=new nonstatic2();
		System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}	
}