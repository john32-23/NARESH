package constructor;

public class NoArgumentConstructorELC {

	public static void main(String[] args) {
		
		// This is Executable logic class for NoArgumentConstructor class
		
		NoArgumentConstructor p1 = new NoArgumentConstructor();
		NoArgumentConstructor p2 = new NoArgumentConstructor();
		
		/*
		 * now we create two objects and we wat to initialized the same vales in //
		 * both the objects, then we can call No-argument Constructor, but for both the objects
		 * the Memory location is different in heap memory with p1 and p2 reference Variable.
		 */		
		p1.showPersonData();
		p2.showPersonData();
		
		// it will print  the same data two times
		

	}

}
