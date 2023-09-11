package package1_for_basics;

public class Parameter_Varaiable {
	
	int a; // Instance Variable OR non-Static Variable
	static int b; // Static or class Variable

	// Create a method with parameters Variable inside.

	public void input(int c) // c is a parameter Variable

	/*
	 * Variable declared inside a (Parenthesis) is called a parameter Variable
	 * .It is used to accept the values from the outer world
	 */

	{

		int d = 10; // d is a local Variable and local variable must be declared and Initialized.
		
	// Variable declared inside a method body called a Local Variable.

		System.out.println("The value of d is : "+ d);
	}

	// main method to start a program execution
	
	public static void main(String[] args) {
		
		// creating Object to print the value of d.
		
		Parameter_Varaiable p1 = new Parameter_Varaiable();
		p1.input(10);
		
		
		// Another example of local and parameter Variable
		
		
		int y = 5; // This is a local variable declared in the main method Body {}
		
		// Calling a method with a parameter and a local Variable
		
       int result = addNumbers(y, 7);  // calling a addNumbers method here
       System.out.println("The sum is : "+ result);
       
       int starts = startFan(4);  // calling startFan method here for execution
       System.out.println("Start the fan in mode :"+ starts);
	}
	
	// Creating a method with input Parameter inside ()
	
	public static int addNumbers(int y , int z) {   // 'a' and 'b' are parameters
        
		
		int sum = y + z;  // 'sum' is a local variable declared inside the method's body
		return sum;       // returning the value of the local variable 'sum'
			
		
		
		// we pass parameter to a method for getting more information regarding a method
		
		
	}
	
	// Another example
	
	public static int startFan(int x){
		return x;   // to execute this we go to a main method
	}
	
	

	

}
