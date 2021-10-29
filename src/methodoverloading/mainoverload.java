package methodoverloading;

public class mainoverload {

	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		mainoverload.main(12);
		mainoverload.main('c');
		mainoverload.main(1236);
	}
}


