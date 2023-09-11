package package1_for_basics;

public class InstanceVariable {
	
	static int y = 50;

	int z = 32; // Here Instance variable declare and Initialized for a diffrent example

	int x; // declare an instance variable

	/*
	 * if a non-Static Variable defined inside a class, but outside of any method or
	 * Constructor then it is called Instance OR Non-Static Variable. A far as its
	 * accessibility is concerned. it is accessible within the same class, means we
	 * can use it anywhere in the class.
	 * 
	 * 
	 * 
	 * They can have different access modifiers to control their visibility and
	 * accessibility from different parts of the code. With PUBLIC access Modifier
	 * instance variables can be accessed from anywhere, including outside the
	 * class. With Private instance variables can only be accessed within the class
	 * they are declared in. With Protected instance variables can be accessed
	 * within the same package and by subclasses (even if they are in a different
	 * package).
	 */

	// Creating a Main method for a program execution

	public static void main(String[] args) {

		// creating two Objects one for initializing value to x
		// then 2 object to store the result of object 1.

		InstanceVariable x1 = new InstanceVariable();
		InstanceVariable x2 = new InstanceVariable();

		// Initializing instance variables for each object

		x1.x = 10;
		x2.x = 20;

		// adding the values of x for each Object
		x1.x = x1.x + x2.x;

		System.out.println("Value of x for Object 1 : " + x1.x);

		/*
		 * Variables in Java that can hold only one value at a time are called
		 * "single-value variables" or simply "variables." These are the most common
		 * types of variables in Java, and they can store values like numbers, with Most
		 * primitive Data-Type like int, short, long, float, double text with non
		 * primitive dataType like String, or objects stored in Reference data-Type or
		 * reference variable
		 */

		InstanceVariable z1 = new InstanceVariable();
		InstanceVariable z2 = new InstanceVariable();

		/*
		 * Role of Instance Variables at Object Creation, whenever we create an Object
		 * by using NEW keyword in java, a Separate copy or mempry Location of all the Instance Variables
		 * will be created. lets call z INSTANCE VARIABLE with the same data 32 to both
		 * Objects z1 and z2.
		 */

		System.out.println(z1.z);
		System.out.println(z2.z);

		++z1.z; // increment the z1 value from 32 to 33

		--z2.z; // decrement the value of z2 from 32 to 31
		
		/*
		 * lets understand it realy holds a separe variable value or copy of variables
		 * or not after increminting z1 and decrementing z2.
		 */
		
		System.out.println("After Incrementing the z1 Object Value :"+z1.z);
		System.out.println("After Decrementing the z2 Object Value :"+z2.z);
		
		
		// But if we use static keyword with variables , so it will create only one copy 
		// for all objects see below
		
		InstanceVariable y1 = new InstanceVariable();
		InstanceVariable y2 = new InstanceVariable();
		
		System.out.println(y1.y);
		System.out.println(y2.y);
		
		/* now see the diffrence after incrementing both objects. 
		 * 
		 * */
		
		++y1.y;  // this should be 51, after increment , but not because
		// it is static variable which keeps only one copy for all objects
		
		++y2.y;  // from here it will increment from 51 to 52 because static variable pnly
		// keeps one copy for all objects , so both y1 and y1 52 value
		
		System.out.println("After Incrementing Y1: "+y1.y);
		System.out.println("After Incrementing y2 : "+ y2.y);

	}

}
