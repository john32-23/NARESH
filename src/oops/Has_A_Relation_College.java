package oops;

public class Has_A_Relation_College {
	
	
	// this is a BLC class ( Business logic class
	
	
	/*
	 * Relation Between the class in two ways: IS-A Relation which is Inheritance
	 * and Has-A relation which is Association
	 */

	String collegeName;
	String  collegeLocation;
	
	private String collegeFuntion;
	
	/*
	 *  Our Both Instance Variables are public and it can easily be accessed by a
	 * instance variable of student class, But if we declare these two variables
	 * private , then we can use setter method to set or initialized the Instance
	 * variables which is already done by a Parameterized Constructor below, now we
	 * only need a Getter Methods for both variables which are collegeName and
	 * collegeLocation, we can write it explicitly or we can generate it through
	 * Source, then Click on "Generate getters and setters" then select "Only Getters"
	 * then click OK. then we can call the instance variables college with getters methods.
	 */
	
	// now lets create a parameterized Constructor through Source then click on "Generate Constructor using Fields"

	public Has_A_Relation_College(String collegeName, String collegeLocation, String collegeFunction) {
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		
		this.collegeFuntion = collegeFunction;
		
	}

	

	public String getCollegeFuntion() {
		return collegeFuntion;
	}
	
	
	
	
}
