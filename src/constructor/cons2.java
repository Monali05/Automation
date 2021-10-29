package constructor;

public class cons2 {
	int roll;
	double salary;
	
	cons2(int r,double s){      //parameterizsd constructor
		roll=r;
		salary=s;
	}

	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons2 c1 = new cons2(101,250045.45);
		cons2 c2 = new cons2(201,550045.45);
		c1.display();
		c2.display();
	}

}
