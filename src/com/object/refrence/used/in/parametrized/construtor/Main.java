package com.object.refrence.used.in.parametrized.construtor;

public class Main {

	public static void main(String[] args) {

		//This is our main class to test it
		
		// FOR EXECUTION we will come to the Main class for execution and testing
    	// we will create an Object of  Employee Object
		
		Employee e1 = new Employee(); 
		
		// now giving or assigning the value with setter method to initialize the Instance variable of Emplyee Variable
		
		
		e1.setEmployeeNumber(111);
		e1.setEmplyeeName("Ali");
		
		e1.setFatherName("Gulzar");
		//Now creating an Object of Manger class
		
		Manager m1 = new Manager(e1);
		
		// here we assigning e1 with Manager class constructor "e" means e= e1
		// means these values we will get through managerID and managerName.
		
		// here we will call the method we created in Manager Class
		
		m1.showManagerData(); // now Run it or call it showManagerData()
		
		System.out.println(m1);  // here we call it or print thr value of toStringMethod().
	}
       
	
	// what we did in all these three classes that we applied that values of "employee " class into the 
	// "Manager" Class and then use the Main Class to print it.
}
