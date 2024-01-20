package com.object.refrence.used.in.parametrized.construtor;

public class Employee {
	
	// this is our business Logic class, if declare Variables private
	// it is always good to use getter and setter methods to access it from other classes
	// because Private Variables we can not  access outside of the class, we can but with getter and setter
	
	//lets create to private instance variables Below
	
	
	private int employeeNumber;
	private String emplyeeName;
	
	private String fatherName;
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmplyeeName() {
		return emplyeeName;
	}
	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}
	
	// you can write manually getter and setter for each variables, but for time saving
	// we can write click inside the editor, then scroll down to "	SOURCE" then Expand "Source"
	// and click on "Generate Getters and Setters" then select the " Variables name" that you want to 
	// generate getter and setter Or "Select all" and then click on "generate". then ctrl+s to save the code.
	
	
	

}
