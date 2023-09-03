package package1_for_basics;

public class LocalVariable1 {
	
	public void calculateSum() {
		int a = 5;
		int b = 10;
		int sum = a+b;
		System.out.println("Sum of the CAlculateSum Method"+sum);
	}
	

		
	
   // we need main method because it is the entry point of execution
	public static void main(String[] args) {
		LocalVariable1 message = new LocalVariable1();
		message.calculateSum(); // calling method here
		
		// Attempting to access 'a' or 'b' would result in compilation
		// error because they are out of scope.
	}
}
