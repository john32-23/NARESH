package constructor;

public class ConstructorCodingExamplParametrized {
	
	// Declaring an Instance Variable
	String name;
	
	
	// creating a parameterized Constructor
	
	public ConstructorCodingExamplParametrized(String na){
		name = na;
		System.out.println("Name is : " + name);
		
	}

	public static void main(String[] args) {
		
		
		/*
		 *  Here is an example of how to create a Person object using the constructor
		 * with two arguments:
		 * 
		 * ConstructorCodingExample e1 = new ConstructorCodingExample("Harvey", 18);
		 */
		
		
		
		/*
		 *  below are the example of how to create a Person object using the default
		 * constructor:
		 * 
		 * // ConstructorCodingExample e2 = new ConstructorCodingExample();
		 */
		
		
		// creating an object to passing a single value
		
		ConstructorCodingExamplParametrized a1 = new ConstructorCodingExamplParametrized("John");
		ConstructorCodingExamplParametrized a2 = new ConstructorCodingExamplParametrized("HARVEY");
		ConstructorCodingExamplParametrized a3 = new ConstructorCodingExamplParametrized("Alex");
		
		
		
	}

}
