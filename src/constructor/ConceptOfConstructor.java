package constructor;

public class ConceptOfConstructor {
	
	/*
	 * In Java, a constructor is a special type of method that is used to initialize
	 * objects. It's called automatically when an object of a class is created. like 
	 * we call method explicitly not automatically when the object of the class is created we are calling with the reference variable.
	 * Constructors must have the same name as the class and don't have a return type,
	 * not even void.  It can be used to set initial values for object attributes.
	 * 
	 * DEFAULT Constructor purpose is to initialized INSTANCE vARIABLE THROUGH DEFAULT Values.
	 * 
	 * 
	 * Variable Initializing is done at the time of creating an OBJECT with a NEW keyword. means when we do not create our own explicit Constructor
	 * VARIABLE RE-Initialization is done at a time of calling the setter method, means both initialization and re-initialization both are done at two different places or lines.
	 * if we used two classes, one with BLC(business logic class) where we declare Instance variable and create setter and getter methods. the second is
	 * ELC(Executable Logic Class) where we create a main class to create an opbject of the BLC class and used main method in ELC class
	 * to start the execution.
	 * 
	 *  
	 */
	
	//lets create a BLC IN THIS CLASS
	
	private int num;
	
	// setter method
	public void setNum(int num) {
		this.num = num;
		
	}
	
	// getter method
	public int getNum() {
		return num;
	}

}



 

