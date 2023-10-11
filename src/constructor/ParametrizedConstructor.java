package constructor;

public class ParametrizedConstructor {
	
	
	// this is our Business logic class. 
	
	
	/*
	 * If one or more than one ARGUMENT is passed to the Constructor and those
	 * argument are separated by comma (,) then it is called a parametrized
	 * Constructor.
	 * 
	 * If we want to initialized all the Objects with diffrernt values not the same
	 * values then we should use parametrized Constructor
	 */
	
	
	// declare the data or instance Varuable
	
	
	private int peopleId;
	private String peopleName;
	
	
	// this is our no-Argument Constructor where inside we { } we can initialized the values
	
	public ParametrizedConstructor() {
		peopleId= 456;
		peopleName= "Harvey";
	}

	/*
	 * now lets create a parameterized Constructor and there are TWO ways to create
	 * a Parameterized CONSTRUCTOR, one to type or write it manually or RIGHT click
	 * inside the class then scroll down to "source" then click on
	 * " Generate Constructor using fields". then select the fields or Variables
	 * name you want to create a parameterized Constructor.
	 * 
	 * if you do not want super  keyword, you can removed it , because it will be added by a compiler automatically
	 */

	public ParametrizedConstructor(int peopleId, String peopleName) {
		this.peopleId = peopleId;
		this.peopleName = peopleName;
	}

	
	
	
	/*
	 * now create a method to display the object properties OR we can use toString() Method
	 * of the OBJECT Class. The difference is that that toString() method will
	 * automatically display the data, then we do not need to write showData() OR
	 * displayData(). 
	 * 
	 * In NoArgumentConstructor class we used showPersonDta() to show the data, but 
	 * here we will use toString() method to display the data or variables values.
	 * 
	 * we can write it manually toString() method or right click inside the class then scroll down to "Source"
	 * then click on "Generate toString " .
	 * 
	 * The default implementation of toString() method in the Object class returns a string consisting of the class name, 
	 * followed by the @ symbol, and then the object's hash code in hexadecimal format. 
	 * 
	 * Hexadecimal Format display in the console: ParametrizedConstructor [peopleId=456, peopleName=Harvey]
	 */
	
	@Override
	public String toString() {
		return "ParametrizedConstructor [peopleId=" + peopleId + ", peopleName=" + peopleName + "]";
	}
	
	

	
}
