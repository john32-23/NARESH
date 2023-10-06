package oops;

public class Encapsulation_DataHiding {
	
	/*  
	 *lets write the properties (variables) private and Behaviors (methods)
	 * public of the BLC class in Encapsulation_DataHiding class. // private means
	 * no one can access the data means variables value from outside the class. but
	 * we can access it through methods which we declared public // deposit() and
	 * withdraw() method. These variables (data) or method should be strongly
	 * associated
	 * 
	 * ENCAPSULATION: it is process to bind the data with its associated method in a single
	 * unit is called ENCAPSULATION. It is used to provide security means we declare our data Private
	 * But we can access/used/Initialized it through methods.
	 * How to apply ENCAPSULATION in our 	Class:
	 * 1) Declare all your instance variable with private access modifier, it some time called tightly encapsulated class
	 * by which we declared all the INSTANCE variables as Private by which we can achieve data hiding.
	 * 2) define GETTERS and  SETTERS to perform read and write operations.
	 * To GENERATE getters and setters for a specific INSTANCE variable or For ALL Instance Variables, Right click inside a 
	 * CLASS, then expand SOURCE, then click on GENERATE GETTERS AND SETTERS, then choose all variables or specific Instance variable.
	 */
	
     int rollNum;   // we achieve data Hiding concept be declaring our data as private.
    public void setRollNum(int rollNum) {
    	
    	// by this setRollNum method we can initialized/set or modify the instance private variables data.
    	// we can use this keyword to initialized our INSTANCE VARIABLES DATA
    	// the main functionality of getter and setter is to WRITE the data through setter method and to get
    	// or READ the data through getter method. GETTER METHOD return type should and must not be void means it wont get or READ if it is void.
    	// and the RETURN type should be the same DATATYPE which is declared as an INSTANCE VARIABLE, if its int it should return int.
    	
    	this.rollNum = rollNum;
    }
    
    public int getRollNum() {
    	
    	
    	return this.rollNum;  // means to get or read the roll Number
    	
    }
}
