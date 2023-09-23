package oops;

public class Encasulation_Main_Class {

	public static void main(String[] args) {
		
		
		
		Encapsulation_DataHiding s1 = new Encapsulation_DataHiding();
		Encapsulation_DataHiding s2 = new Encapsulation_DataHiding();
		/*
		 * s1.rollNum = 2000;  
		 *  this is for practice example if we declare our variables means data as public in BLC class we can access the data WHICH
		 * is not good for data hiding, bUt if we can declare the Variables IN BLC class as PRIVATE we can not access it here. it will give error
		 * 
		 */		
         
		s1.setRollNum(111);  // Set the value or data for instance Variable
		
		System.out.println(s1.getRollNum());  // read Or retrieve/ receive the data through getter
		
		
		
		s2.setRollNum(112);
		
		// we can save getter inside another variable
		
		int roll = s2.getRollNum();
	    System.out.println(roll);	
	}

}
