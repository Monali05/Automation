package constructor;

public class withoutmethod {
	int age=50;
	double salary;
	
	withoutmethod(){
		//explicit default constructors---> no para and empty body
	}
	public static void main(String[] args) {


		withoutmethod c1=new withoutmethod();//default constuctor
		
		System.out.println(c1.age);//0
		System.out.println(c1.salary);//0.0

	}

}


