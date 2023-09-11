package package1_for_basics;

public class Variable {
	public static void main(String[] args) {
		
		int x= 20;
		int y= 35;
	
		/*
		 * To change the value of variable you can not declare it again with
		 * Data-Type means if int x= 20; then x= 34; not int x= 34; because
		 * Variable can store One value at a time not multiple means
		 * if x was 20 now x 55. we can store multiple value of the same
		 * Data-Type in Array Class.
		 */
		
		
		// Add the values of x and y and store the result back in x
		x = x+y;
		
		// Display the updated value of x
        System.out.println("The updated value of x is: " + x);
	}
	
	

}
