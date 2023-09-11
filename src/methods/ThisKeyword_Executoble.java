package methods;

public class ThisKeyword_Executoble {

	public static void main(String[] args) {
	
		// lets create a class of this_Keyword class for execution
		
		This_Keyword m1 = new This_Keyword();
		
		// calling acceptData
		m1.acceData(111, "John");
		
		// calling ShowData
		m1.showData();
		
		/*
		 * now if we run the code 111 and john will be assigned to Parameter Variables
		 * But at RunTime Environment , it did not reocnized which one is Instance
		 * Varaible and which one is Parameter Variable, Because both Instance and
		 * parameter VARIABLE has the SAME NAMES But By DEFAULT Every class has A
		 * DEFAULT CONSTRUCTOR which is used to initialized Instance Variable so by
		 * Default values of instance Variables will be 0 for int and null for String.
		 * will be provide by a default Contructor
		 * 
		 * 
		 * so how to print 111 and John, because m1 is a Refrence Variable and refreing to
		 * This_Keyword Object which has two String Variables and two Methods which is acceptData
		 * and showData.
		 * 
		 * 
		 * So m1 is Refring to the current Object, but we can also refer to This_Keyword Object by using 
		 * THIS KEYWORD, now to diffrentiate between instance and parameter, go back to This_Keyword class
		 * and use this keywordin LHS of variable name. Now
		 * when it comes to execution the Run Time enviroment will understand that LHS is Instance Vraible = 
		 * RHS parameter and THIS KEYWORD always use with INSTANCE VARIABLE NOT WITH PARAMETS
		 * 
		 * 
		 * 
		 * Also this keyword associated with Objects not with methods, because m1 is a local refernce variable
		 * because m1 is delared inside main method body {}.
		 * 
		 * and this keyword we can not use with Static DATA members like in static main method and static variables.
		 * because this is a non-static member.
		 * 
		 */
		
		System.out.println("See the diffrence value result before this keyworda and after adding this keyword\n");
		
		This_Keyword m2 = new This_Keyword();
		m2.acceptedData(111, "John");
        m2.showData();
	}

}
