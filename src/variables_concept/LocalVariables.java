package variables_concept;

public class LocalVariables {
	// A variable is a name given for the memory location.
	public void printmessage() {

		String message = "Hello world"; // Local Variable declare and Initialized inside method body {}
		System.out.println(message);
	}

	// we need main method for the execcution of the program
	int y = 10;
	static int b = 65;

	public static void main(String[] args) {
		
		LocalVariables message1 = new LocalVariables();
		message1.printmessage(); // calling the method here 
		message1.showMessage(); // using same local variable name in all method.
		message1.displaymessage();
		
		int x = 20; // This is called Local variable
		// A local variable must be declared and initialed inside the Body { }
		// of a method and it can not be access outside of method,
		System.out.println("X value is:" + x);

		// A local Variable must be declared and initialized Example below

		int c;
		// System.out.println(c);
		// error message The local variable c may not have been initialized

		// We can not use any kind of Access Modifier with Local Variable
		// except final Modifier. Examples Below:

		// public int z = 34; Illegal modifier for parameter z; only final is permitted

		final int z = 34;
		System.out.println(z);

		// we can not print y here because it is a instance variable
		// which means belongs to objecs not to specific method/Behavior
		// System.out.println(y);

		System.out.println(b);
	}
	
	// Reusability: The same Local variable name can be used in different methods or blocks 
	// without conflicts because they have different scopes.

	public void showMessage() {
		String message ="Hello from show message";
		System.out.println(message);
	}
	
	public void displaymessage() {
		String message ="Hello from Display message";
		System.out.println(message);
		
	}
}
