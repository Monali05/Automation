package blocks;

public class mixblockconstructor {

	mixblockconstructor(){
		System.out.println("zero-param cons..");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		mixblockconstructor a=new mixblockconstructor();
		System.out.println("---------------------------------");    //object create jevdhyaveles hoil tevdhya veles nonstaticblock execute hoil
		mixblockconstructor a1=new mixblockconstructor();
		System.out.println("main() ends");
	}
}
