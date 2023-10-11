package constructor;

public class ConstructorCodingExample {
	
    // Creating a BLC with data means ATTRIBUTES/VARIABLES and METHODS/FUNCTIONS
	
	
	private String name;
	
	// Creating a Constructor
	
	public ConstructorCodingExample() {
		
		System.out.println("Constructor caleed: ");
		name = "Hello";
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		// constructor is called while creating an Object
		
		ConstructorCodingExample obj = new ConstructorCodingExample();
		System.out.println("The name is :"+obj.name);
	}
	
	

}
