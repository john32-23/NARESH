package constructor;

public class ParametrizedConstructorELC {

	public static void main(String[] args) {
		
		
		// this is the Executable logic class for ParametrizedConstructor to create objects here
		
		ParametrizedConstructor m1 = new ParametrizedConstructor();
		System.out.println(m1); // this m1 will called toString method
		
		
		/*
		 * Or we can use the below way to call the toString Method(). when we call
		 * the Parameterized Constructor //data or Variables OR parameters which are int
		 * and String. with this type of constructor we can use different values for
		 * different objects.
		 */
		
		
		ParametrizedConstructor m2 = new ParametrizedConstructor(30, "Alex");
		System.out.println(m2.toString());
      
		// Another parametrized Constructor Object call
		
		ParametrizedConstructor m3 = new ParametrizedConstructor(234 , "Harey");
		System.out.println(m3);
	}

}
