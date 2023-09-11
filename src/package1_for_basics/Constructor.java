package package1_for_basics;

class Constructor {

	/*
	 * In Java, a constructor is a special type of method that is used to initialize
	 * objects. It's called automatically when an object of a class is created.
	 * Constructors have the same name as the class and don't have a return type,
	 * not even void.
	 */

	int rollNo; // Instance variables
	String name; // instance variable

	public void talk() {
		System.out.println("My roll number is : " + rollNo);
		System.out.println("My name is : " + name);
	}

	// To start the execution of any java program we need a main method.
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1.talk();

		/*
		 * it will call the talk method and will print the default values of int and
		 * string, because the compiler will add a default Constructor of constructor
		 * Class.class The main purpose of default constructor to initialize the
		 * Instance VARIABLES with some deafult values. The compiler will assign the
		 * default values to the dataTypes.
		 */
		

		/*
		 * Constructor c1 = new Constructor(); lets understand this // LHS(left hand
		 * side) Constructor c1 = RHS(Right hand side) // new Constructor(); LHS
		 * Constructor c1 is a user-defined // dataType means its the same is predefined
		 * int x = 1; like // Constructor is a class or user-defined and c1 is a
		 * Reference // Variable of class or user-defined datatype. we can only assign //
		 * to the RHS only objects means only Constructor Objects not any // other type
		 * of objects because the c1 Data-TYPE of this object // is Constructor name. TO
		 * hold an object we use NEW keyword on // the RHS means = new Constructor();
		 * 
		 * 
		 * here the role of new keyword is DYNAMIC MEMORY ALLOCATION.
		 * Three things are included in objects
		 * 1. c1 is the Name of Object OR Reference variable because it refer to that Object
		 * 2. PROPERTIES/STATES means Variables Instance or Static , in upper example we have rollNo and name instance Variable.
		 * 3. BEHAVIOUR means method/Function in upper example we had talk() and main method
		 * OBJECTS ALWAYS CREATED IN HEAP MEMORY
		 * 
		 * 
		 * 
		 * On the RHS we are calling it a  Constructor(); but we have not
		 * defined or declared any Constructor() on top, but Java Compiler will
		 * add or defined a Default Constructor for every class if we have not defined.
		 * If the Compiler is not adding up any Default Constructor, then in java
		 * we can not create any Objects. The compiler is adding up a 
		 * Default Constructor SO THE OBJECT CREATION IS POSSIBLE in java.
		 * 
		 * 
		 * Conclusion, Every Class in java has a Constructor means whether it 
		 * will be defined by user, if not by user, then compiler will add up
		 * a default Constructor
		 */
	}

}
