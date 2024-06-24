package Assignment.One;

public abstract class Account {
	public abstract void deposit(double amount);     //create abstract method
	public abstract void withdraw(double amount);     //create abstract method
	public abstract double getBalance();    //create abstract method
	
	public void display() {  // create concrete method
		System.out.println("Your balance is "+ getBalance());
	}
	
}
class SavingsAccount extends Account{  //create subclass
	double balance;

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		System.out.println(amount + "deposited in saving account");
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>amount) {
			balance = balance - amount;
			System.out.println(amount + "withdraw in saving account");
			
			
		}
		else {
			System.out.println("Not accepted ");
		}
		
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	
	

}
class CheckingAccount extends Account{  // create subclass
	double balance;

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		System.out.println(amount + "deposited in checking account");
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>amount) {
			balance = balance - amount;
			System.out.println(amount + "withdraw in checking account");
			
			
		}
		else {
			System.out.println("Not accepted ");
		}
		
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}


	
}
