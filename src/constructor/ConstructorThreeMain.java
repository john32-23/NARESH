package constructor;

public class ConstructorThreeMain {

	public static void main(String[] args) {
		
		// Creating an OBJECT of BLC class and then getting the value of number
		
		ConstructorThree c1 = new ConstructorThree();
	int eno = c1.getNumber();
	System.out.println(eno);

		
		/*
		 * Here if we define our OWN CONSTRUCTOR , then Compiler will not add any
		 * default Constructor, In this case, Variable INITIALZATION and
		 * Re-Initialization both are Done at the same place ( not a diffrent place) at
		 * the time of creating an Object. that is the benefit if we define the
		 * constructor.
		 */
		
	}

}
