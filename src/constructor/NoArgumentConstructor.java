package constructor;

public class NoArgumentConstructor {
	
	// this is a Business logic class
	
	/*
	 * If we do not pass any argument or parameter to the constructor then it is
	 * called No Argument OR Parameterless Constructor. If we want to initialized
	 * all the objects with the same or common value then we use NO-argument
	 * Constructor.
	 */
	
	// declare the data or variable Instantly
	
	private int personId;
	private String name;
	
	
	// see Example Below of NoArgumentConstructor
	
	
	NoArgumentConstructor(){
		
		/*
		 * Note: Default Constructor and No-Argument Constructor looks like same, the
		 * Only difference is, default constructor is added by compiler, where
		 * No-Argument Constructor is written or added by user or programmer.
		 * 
		 * 
		 * Remember: the main purpose of Constructor to initialized the instance Variables of the class
		 */
		
		personId = 321;
		name = "John";
		
	}
	
	// creating a method to show the data.
	
    public void showPersonData() {
    	System.out.println("person Id is : "+personId);
    	System.out.println("Name is :"+name);
    	
    	// now lets go ELC class
    }
}


