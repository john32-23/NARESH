package methods;

public class This_Keyword {

	/*
	 * In Java, the this keyword is a reference to the current instance of a class
	 * or Object. It is used within instance methods and constructors to refer to
	 * the instance or object on which the method is invoked. The primary purposes
	 * of the this keyword are to Diffrentiate Between INSTANCE variables and method
	 * PARAMETERS with the SAME NAME and to access instance methods and variables.
	 */

	int managerId;
	String managerName;

	// lets create a method with same Name parameters

	public void acceData(int managerId, String managerName) {

		/*
		 * If we want to initialized parameters in Instamce variable, we can but there
		 * variable name color will be the same here, but upper Instance Variable name
		 * is Bkue but here inside method it will be brown.
		 */

		managerId = managerId; // LHS Instance variable = RHS Parameter Variable
		managerName = managerName;

		/*
		 * now Lets add this keyword on LHS side to see the color will be Blue means
		 * Instance varuable and RHS will be parameter Brown color. because Local or
		 * parameter variable is not a part of the objects, only Instance variable in
		 * this case. or always the part of Object.
		 * 
		 * 
		 * Conclusion whenever to Diffrentiate Between INSTANCE variables and method
		 * PARAMETERS with the SAME NAME and to access instance methods and variables we
		 * use this Keyword.
		 *
		 */

		
		}
		
		
		
		/*
		 * After adding this keyword to instance variable on the second method below 
		 * it will show john and 111 in the console,
		 */
		
	
	public void acceptedData(int managerId, String managerName) {
		this.managerId = managerId;
		this.managerName = managerName;
		
	}

	// Lets create Another Method to show the data

	public void showData() {

		System.out.println("Manager Id is : " + managerId);
		System.out.println("Manger name is: " + managerName + "\n");

		/*
		 * in these two sysout both instance variable shows in Blue color because we can
		 * use Instance Variables for all methods not Parameters, because Parameter
		 * accessibility lies inside the method not outside the method.
		 * 
		 * 
		 * Lets create another Executible class to show the result
		 */
	}

}
