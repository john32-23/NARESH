package constructor;

public class ConstructorThree {
	
	private int number;
	
	/*
	 * Now we need to create a CONSTRUCTOR in this class to initialized the Instance
	 * Variable means without using the setter method, now we are using constructor
	 * to initialized the instance variable and now using the GETTER method to get
	 * the Values of Number Instance variable.. It is not necessary whenever we are
	 * using setter method then we have to use getter method, we can also used
	 * GETTER method with a constructor to getter the values of Instance Variables.
	 */
	
	// creating a CONSTRUCTOR
	
	public ConstructorThree() {
		//initializing "number" variable here
		
		number = 13 ;
		
		
	}
	
	// now using GETTER METHOD to return the value of INSTANCE variable which is initialized through CONSTRUCTOR
	
	public int getNumber() {
		return number;
	}

}

