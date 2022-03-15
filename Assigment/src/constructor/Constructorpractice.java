package constructor;

public class Constructorpractice { //day 32
	
	int a;
	int b;
	boolean c;
	

	public Constructorpractice() { // no parameterized constructor
		
		this(6); // It is calling another construct within same class having one parameter
		System.out.println("i am a non para constructor");

	}
	
	
	public Constructorpractice(int a) { //para constructor
			
			System.out.println("i am parametreized constructor"); // contructor can be overload
		
	
	}
                public Constructorpractice(int a, int b) { //para constructor
		       
                	
			System.out.println("i am two parametreized constructor"); // contructor can be overload
		
                }
	
                public static void main (String[] args) {
		// TODO Auto-generated constructor stub
	
	 Constructorpractice obj=new Constructorpractice();
     obj=new Constructorpractice(7);
	/*
	System.out.println(obj.a);

	System.out.println(obj.b);
	
	System.out.println(obj.c);
	Constructorpractice obj1 =new Constructorpractice();{
	
		System.out.println(obj1.a);

		System.out.println(obj1.b);
		
		System.out.println(obj1.c);
	*/
	}
                
}	


	
	
	
	

