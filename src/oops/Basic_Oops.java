package oops;

public class Basic_Oops {
	
	/*
	 * To make a good Object oriented approach we can not define or create
	 * everything in one class.In Java, when designing an application, it's common
	 * to separate the code into two main types of classes: business logic classes
	 * and executable logic classes. These classes serve different purposes and help
	 * in organizing and maintaining code
	 * 
	 * 
	 * 
	 * Purpose: Business logic classes contain the core functionality or rules of your 
	 * application. They handle data processing, calculations, and operations specific 
	 * to your domain or business requirements. These classes encapsulate the behavior 
	 * that your application needs to perform. and we can reuse these common utilities or classes again N again

Example: Let's consider a simple banking application. You might have a BankAccount class 
that represents a bank account with methods for depositing, withdrawing, and checking the 
balance. This class contains the business logic for managing bank accounts.


Executable Logic Class: means it will have a main method to start execution

Purpose: Executable logic classes contain the entry point of your program and are responsible 
for orchestrating the flow of your application. They typically contain the main method and are 
used to create objects, call methods from business logic classes, handle user input, and respond to events.

Example: In the banking application, you might have an BankApp class that serves as the executable logic class. 
It initializes BankAccount objects, takes user input, and calls methods on the BankAccount objects to perform operations.



We can delare only one class name to be public because of its accessbility and we can
declare a class public which has .java extension, suppose on this class we can declare Basic_Ooops class cab be declared
as public class because of .java extension , if we want to include another class in the same classs then we can not use
public access modifier, it will show a compilation error.
That is wht we use BUSINESS LOGIC AND EXECUTIABLE CLASSES separately.

      Lets Write BLC(Business logic class) here
	 */

	
	String customerName; //Instance variable, variable name in camelCASE.
	double customerBill; // we can use both variables in all methods
	
	
	// lets create a method with two parameter variable
	
	public void acceptData(String name, double bill) {
		// here name and bill is a parameter Variables and its scope lies inside a method
		
		customerName= name;
		customerBill = bill;
		
		/*
		 * Here we initialized name and bill parameter Variables in Instance variables,
		 * because Instance variables accept the values from outside.
		 */
		
		
	}
	
	//Another method for display the data
	
	public void displayData() {
		System.out.println("Customer Name is : "+ customerName);
		System.out.println("Customer Bill is : "+ customerBill);
	}
	
	// now how to use this class Reusable, we have to create another class
	// with the name of Execucutiable and create a Main method there
}
