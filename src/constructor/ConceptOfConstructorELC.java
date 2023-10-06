package constructor;

public class ConceptOfConstructorELC {

	public static void main(String[] args) {
		
		/*
		 * creating the same class inside another class, we can do that without
		 * public access modifier , but if we are trying with public acces modifier it
		 * will give an error. this will be the ELC class
		 * when we create an object it will initialized the num Variable with the integer Default values which is one
		 */
		
		ConceptOfConstructor n1 = new ConceptOfConstructor();
		 n1.setNum(10);
		 System.out.println(n1.getNum());

	}

}
