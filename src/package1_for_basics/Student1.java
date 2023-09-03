package package1_for_basics;

public class Student1 {
	
	int rollNum;
	String name;
	double height;

	// So these three are Properties/States for Class Object
	// Studebt1 we define only once for both objects and here
	// we initialize (means give initial value) the variables through objects

	public void talk() {
		System.out.println("My rollNum is :" + rollNum);
        System.out.println("My name is :"+ name); 
        System.out.println("My height is :"+ height);
        
       
        
		// this is the behavior for a class object we defined 
        // only once for both objects
	}

	// for the execution we need a main method

	public static void main(String[] args) {

		// Now lets create an object. To create an object we need a class
		// Using that class Name and reference variable means pointing to a specific
		// memory then = new keyword for dynamic memory allocation then Constructor
		// which is Student(). It has a class name and parenthesis.

		Student jav = new Student(); // Object created
		
		Student jav1 = new Student();
		
		jav1.rollNum = 143;
		jav1.name = "Sohrab";
		jav1.height = 6.1;
		
		// here we created two objects, but we defined the method/Behavior
		// and properties/variables only once at instance level.
		jav.rollNum=23;
		jav.name= "Ahmad"; //String must be in double quotation
		jav.height = 5.8;  // double must be a decimal value
		
		// now we can use reference variable jav to perform talk behavior actions
		
		jav.talk();
		jav1.talk();

}
}