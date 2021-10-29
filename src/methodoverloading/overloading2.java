package methodoverloading;

public class overloading2 {
	double sum(int g, int h) {
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String args[]) {
		overloading2 ob = new overloading2();
	 ob.sum(20, 20);
	 ob.sum(20, 20.56);

	}
}

