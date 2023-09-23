package oops;

public class DataHiding_Main {

	public static void main(String[] args) {
		
		

		// this class is a ELC ( executiable logical class) means the execution will be here
		// because of main method first we need an object of that BLC class
	
		Data_Hiding a = new Data_Hiding();
		
		// lets write  the properties (variables) private and Behaviors (methods) public of the BLC class in DataHiding class.
		// private means no one can access the data means variables value from outside the class. but we can access it through methods which we declared public
		// deposit() and withdraw() method. These variables (data) or method should be strongly associated
		
		a.deposit(0);  // this is for if-else logic means the balance is 0 or less than zero will not be deposited
		
		
		a.deposit(2000);  // this will be deposited because the balance is greater than zero
		

	}

}
