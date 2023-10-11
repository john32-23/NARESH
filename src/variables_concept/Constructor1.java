package variables_concept;

public class Constructor1 {
	
	
	int rollNo;
	String name;
	
	// method to initialize user values to these Instance Variables
	
	public void accept() {
		rollNo= 134;
		name = "John";
		
	}
	
	// other method to display those values.
	public void display() {
		System.out.println("My rollNumber is :"+ rollNo);
		System.out.println("My Name  is :"+  name);
		
	}
	
	
	// Main method to start the  execution of the program and object creation
	public static void main(String[] args) {
		
		Constructor1 c1 = new Constructor1();
		
		/*
		 * Here also java Compiler will add a Default Constructor, but it will not add
		 * up a default values, because we already created a method to initialized those
		 * instance variables. so we can call those two methods by a Refrence Variable
		 * OR object Name c1.
		 */
		
		
		
		/*
		 * Here if we call the display method it will call the Default Constructor1
		 * to initialize the default values which is 0 and null
		 */
		
		c1.display();
		
		/*
		 * Here we calling the display method with accept() method to assign the
		 * values to Instance Variables.
		 */
		
		c1.accept();
		c1.display();
		
		
	}
}
