package blocks;

public class mixblock {

	mixblock (){
		this(10);
		System.out.println("zero-param cons..");
	}
	mixblock (int i){
		System.out.println("int-param cons..");
	}
	
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	void print() {
		System.out.println("java");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		mixblock  m=new mixblock ();
		m.print();
		System.out.println("---------------------------------");
		mixblock  m1=new mixblock ();
		m1.print();
		System.out.println("main() ends");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-2 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}