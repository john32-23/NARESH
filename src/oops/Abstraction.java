package oops;

public class Abstraction {
	
	/*
	 * Showing the essential details with showing the background or Implementation
	 * details is called Abstraction.
	 * In order to ACHIVE ABSTRACTION in JAVA. we have TWO techniques.
	 * 1) Abstract class with abstract method (partial Abstraction). 
	 * 2) INTERFACE (100% OR COMPLETE Abstraction)
	 * 
	 * 
	 * The ABSTRACT keyword is a non-access modifier, used for classes and methods.
	 * 
	 * 
	 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
	 * An abstract class in Java is a class, which is declared with an abstract keyword. It is just like a normal class but has two differences.
	 * 1. We cannot create an object of this class. Only objects of its non-abstract (or concrete) sub-classes can be created. why see below reason
	 * Abstract classes are intended to be incomplete by design. They contain one or more abstract methods that have no implementation in the abstract class itself. 
	 * This is meant to be provided by the subclasses.
	 * The second reason is Designed for inheritance - The purpose of an abstract class is to provide a common definition of a base class that multiple subclasses 
	 * can inherit from and build upon. It defines a template or blueprint that subclasses are meant to follow.
	 * 2. It can have zero or more abstract methods which are not allowed in a non-abstract class (concrete class). Classloader class is a good example of 
	 * an abstract class that does not have any abstract methods.
	 * 
	 * 
	 * 
	 * 
	 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
	 * Abstract method means method with no body . see below example
	 *   public void animalSound(); // interface method (does not have a body)
         public void run(); // interface method (does not have a body)
         
     Key points:

1. Abstract is a non-access modifier in Java which is applicable for classes, interfaces, methods, and inner classes. It represents an incomplete class 
that depends on subclasses for its implementation. Creating subclass is compulsory for abstract class.
2. A non-abstract class is sometimes called a concrete class.
3. An abstract concept is not applicable to variables.
	 */

}
