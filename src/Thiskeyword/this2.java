package Thiskeyword;



class B{
	int i=10;
	
	B(){
		System.out.println("i : "+this.i);
		System.out.println("Running Class B constructor..");
		i=23;
	}
}
public class this2 {
	public static void main(String[] args) {
	System.out.println("Main() of Class Cons5 is started...");
	B b1=new B();
	System.out.println("Class B global varibale i = "+b1.i);
}
}