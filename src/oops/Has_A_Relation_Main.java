package oops;

public class Has_A_Relation_Main {

	public static void main(String[] args) {

		/*
		 * in Has_A_Relation_College class we have two String variables whichwe can
		 * Initialized here inside an object ,both variables which id collegeName and
		 * collegeLocation.
		 */
		
		Has_A_Relation_College c1 = new Has_A_Relation_College("CodeACademy", "Online", "Technology");
		
		
		Has_A_Relation_Student s1 = new Has_A_Relation_Student(123, "john", c1); 
		s1.showStudentData();
		// here c1 holds two variables inside which is collegeLocation and collgeName
		
		Has_A_Relation_Student s2 = new Has_A_Relation_Student(453, "Alex", c1);
		s2.showStudentData();
		
		/*
		 * In both the Objects only Has_A_Relation_Student class variables values
		 * changes not Has_A_Relation_College class, it will be the same for all the
		 * Objects.
		 */
	}

}
