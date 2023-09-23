package oops;

public class Data_Hiding {
	
	// as BLC(business logic class) means we will write all the logic here

		private double balance = 10000;
		
		
		// lets write Behavior
		public void deposit(int amount) {
			// logic inside a method , as we discussed we use this keyword if the instance and parameter variable function are same.
			// and also to represent instance variable
			if(amount <=0) {
				System.out.println("Amount is less than zero");
			}else {
				
			
			this.balance = this.balance + amount;
			System.out.println("Balance after deposit " + this.balance);
			}	
		}
		
		public void withdraw(int withdraw) {
			
			this.balance = this.balance - withdraw;
			System.out.println("Balance after withdraw : "+ this.balance);
		}

}
