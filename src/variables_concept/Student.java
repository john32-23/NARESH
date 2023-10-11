package variables_concept;

import java.util.Objects;

public class Student {

	// Here we create a class to define the properties/States
	// means variables and Behaviors means Function/Method for Objects

	int rollNum;
	String name;
	double height;

	// So these three are Properties/States for Class Object
	// which is Student and we initialize the variable through objects.

	public void talk() {
		System.out.println("My rollNum is :" + rollNum);
        System.out.println("My name is :"+ name); 
        System.out.println("My height is :"+ height);
        
		// this is the behavior for a class object
	}

	// for the execution we need a main method

	public static void main(String[] args) {

		// Now lets create an object. To create an object we need a class
		// Using that class Name and reference variable means pointing to a specific
		// memory then = new keyword for dynamic memory allocation then Constructor
		// which is Student(). It has a class name and parenthesis.

		Student jav = new Student(); // Object created
		
		// now we have to give a value to properties using 
		// Object reference
		jav.rollNum=23;
		jav.name= "Ahmad"; //String must be in double quotation
		jav.height = 5.8;  // double must be a decimal value
		
		// now we can use reference variable jav to perform talk behavior actions
		
		jav.talk();
	}
}
