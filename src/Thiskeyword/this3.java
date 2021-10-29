package Thiskeyword;

public class this3 {
	 int a;
	    int b;     
	    // Parameterized constructor
	    this3(int a, int b)
	    {
	      //  this.a = a=50;
	        //this.b = b=50;
	        this.a = a;
	        this.b = b;
	    } 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    } 
	    public static void main(String[] args)
	    {
	    	this3 object = new this3(10, 20);
	        object.display();
	     //   System.out.println(object.a+" "+object.b);//10 20
	        this3 object2 = new this3(102, 201);
	        object2.display();
	      //  System.out.println(object2.a+" "+object2.b);//102  201
	    }
	}

