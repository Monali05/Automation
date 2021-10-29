package methodoverloading;

class SuperClass {
	void msg(int x, int y) {
		System.out.println(x+ "x : y :" +y);
	}
}

class Subclass {
	void msg(double x, double y) {
		System.out.println("Welcome you in Java programming");
		System.out.println("x :" +x);
		System.out.println("y :" +y);
	}
}
public class supersub {
		public static void main(String[] args) {
			Subclass sc = new Subclass();
			sc.msg(10, 20);
			sc.msg(2.5, 3);
			
			SuperClass sc1=new SuperClass();
			sc1.msg(20, 30);
		}
	}

