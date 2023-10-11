package oops;

public class Has_A_Relation_Student {
	
	// This is also BLC class
	
	private int studentId;
	private String studentName;
	
	/*
	 * below college reference variable which is a type of Instance Variable But
	 * we can assign in college a Has_A_Relation_College class Object.
	 */
	
	private Has_A_Relation_College college;  // this is a Has-A relation

	/*
	 * now lets create again Parameterized Constructor through source then Click
	 * on "Generate Constructor using fields". you can or can not remove super keyword
	 */
	
	public Has_A_Relation_Student(int studentId, String studentName, Has_A_Relation_College college) {
		
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
	}
	
	// Here again we can use toString Method oe we can write showData method, go back to parametrized Constructor Concept.
	
	public void showStudentData() {
		System.out.println("Student Id is :"+ studentId);
		System.out.println("Student Name is :"+ studentName);
		System.out.println("College Nane is :"+ college.collegeName);
		System.out.println("College Location is :"+ college.collegeLocation);
		/*
		 * we can not call the collegeFunction variable directly through college
		 * reference or instance variable // we need to create a getter method for that
		 * specific variables because it is private and it is already initialized inside
		 * the parameterized constructor. But if all the variables are private then we need a getter
		 * methods for all the varaibles.
		 */
		
		System.out.println("College Function is : "+ college.getCollegeFuntion());
		
		/*
		 * In side Has_A_Relation_College class we have to variables which is
		 * CollegeName and collegeLocation and we call with the Has_A_Relation_Student
		 * class instance Cariable which is college with dot "." operator.
		 */


	}
	

	
}
