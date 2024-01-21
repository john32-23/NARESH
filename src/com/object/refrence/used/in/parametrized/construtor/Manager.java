package com.object.refrence.used.in.parametrized.construtor;

public class Manager {
	
	//This is also our Business logic class and we will declare to instance private Variables
	// here we do Instance variable initialization Through Parametrized Constructor
	
	private int managerId;
	private String managerName;
	
	private String managerFatherName;
	
	// we declare this Manager Class Concept to adopt the value of Employee person , now 
	// he is a manager, so just the position changed, the id and Name are the same thagt we can get
	// it  from "Employee claa."
	
	// So here we will use "Object Refrence" Concept
	
	//Declare Parametrized Constructor of Manager class, inside we use Class or user-defined parameter of Employee class refrence.
	
	public Manager(Employee e) {  // e is the "Object Refrence" of Employee class
		
		// e is holding the Object of "Employee" Class and the Object of Employee e is Containing
		// the properties(Variables) and methods(Behaviours).
		
		managerId = e.getEmployeeNumber();  // here we assigning EmployeeNumber to mangaerId to initialized mangerId Instance Variable
		managerName = e.getEmplyeeName();   // same here
		managerFatherName = e.getFatherName();
	}
	
    public void showManagerData() {
    	System.out.println("Manager Id is : " + managerId);
    	System.out.println("Manager Name is : " + managerName);
      
    	// FOR EXECUTION we will go to the Main class for execution and testing
    	// we will create an Object of  Employee Object
    }
     
    // we can perform the above actions with "toString()" method without creating a method
    // called "showManagerData()" and then using sysout Statement in Main Class to print m1 refrence 
    // in a Array Format. It is up to the person , whatever they prefrered toString() method or user-defined method.
    
    // lets print the last Variable fatherName with ToString method
    // right click inside the editor, then scroll to "SOURCE" then click on "Generate toString()" method
    // inside "Fields" select only fatherName fields and then click on generate 
	@Override
	public String toString() {
		return "Manager [managerFatherName=" + managerFatherName + "]";  // this line will print the value in this array format
	}
    
   
    
}
