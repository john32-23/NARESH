
public class ConstructorCodingExamplDefault {
	
	// declaring Data
	
	int a ;
	boolean b;
	String name ;
	double c ;
	
	
	public static void main(String[] args) {
    
		// creating an OBJECT
		
		ConstructorCodingExamplDefault b1 = new ConstructorCodingExamplDefault();
		
		System.out.println("Default VALUE: ");
		
		// we can call it this way
		
		int a = b1.a;
		System.out.println("a = " + a);
		
		// OR we can call it one sysout Statement
		
		System.out.println("b = " + b1.b);
		
		System.out.println("name = "+ b1.name);
		
		double c = b1.c;
		System.out.println("c = "+ c);
		
		
	 // All of these are calling default Constructor and the purpose of defalut
		// Constructor to initialize the instance variables with Default values
	}

}
