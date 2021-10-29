package Thiskeyword;

public class this1 {
	//Global Variable or non static GV or Instance GV
		int variable = 5;
		public static void main(String args[]) {
			this1 obj = new this1();
			obj.method(20);
			obj.method();
		}
		void method(int variable) {
			variable = 10;
			System.out.println("Value of Instance variable :" + this.variable);//5
			System.out.println("Value of Local variable :" + variable);//10
		}
		void method() {
			int variable = 40;
			System.out.println("Value of Instance variable :" + this.variable);//5
			System.out.println("Value of Local variable :" + variable);//40
		}
	}


