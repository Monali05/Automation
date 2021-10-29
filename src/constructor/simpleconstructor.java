package constructor;

public class simpleconstructor {
	public simpleconstructor() {
		System.out.println("This is a zero-para constructor");
	}
	
	public simpleconstructor(char c) {
		System.out.println("c :" +c);
	}

	public simpleconstructor(int num1, int num2) {
		System.out.println("num1 : "+num1 +" " +"num2 :"+num2);
	}

	public static void main(String[] args) {
		simpleconstructor c1 = new simpleconstructor();
		simpleconstructor c2 = new simpleconstructor(10, 20);
		
		simpleconstructor c3 = new simpleconstructor('d');
	}
}


