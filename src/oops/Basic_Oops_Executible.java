package oops;

public class Basic_Oops_Executible {
	
	public static void main(String[] args) {
		
		// lets create an object of BLC class which is Basic_Oops .
		
		Basic_Oops customer1 = new Basic_Oops();
		// to accept the data we can call accept data with  one String and one Double value.
		
		customer1.acceptData("John", 232.11);
		
		// now lets Display the dat method call.
		
		customer1.displayData();
		
		
		/*
		 * So suppose if we want to use BLC (Business Logic Class) Again in
		 * ELC(Executible Logic Class) so we can use it with another customer data see
		 * below Reusibility. we can use it N number of times.
		 */
		
		Basic_Oops customer2 = new Basic_Oops();
		
		customer2.acceptData("Harvey", 2313);
		
		customer2.displayData();
		
		
		
		
		
	}

}
