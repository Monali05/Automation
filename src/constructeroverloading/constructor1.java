package constructeroverloading;

public class constructor1 {
	constructor1() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	constructor1(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println("a :" +a);
	}
		constructor1(int a, double b, int c) {
			System.out.print("Parameterized Constructor\n");
			System.out.println("a:"+a +" " +"b:"+b  +" " +"c:"+c);
			//System.out.println("b :" +b);
			//System.out.println("c :" +c);
		}	
public void show() {
	System.out.println("hello");
}

	public static void main(String args[]) {
		constructor1 pc5 = new constructor1();
		pc5.show();
		constructor1 pc1 = new constructor1(12);
		pc1.show();
		constructor1 pc3 = new constructor1(10,13.34,45);
		pc3.show(); 
	}
	}