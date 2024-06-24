package Assignment.One;

public final class Transaction {
	
	final int transactionFee = 12;
	
	

	public final void performDeposite(double amount, Account accountName) {
		amount = amount - transactionFee;
		System.out.println("Transaction fee =" + transactionFee);
		System.out.println("AMOUNT DEPOSITED SUCCESSFULLLY AFTER FEE : " + amount);
		accountName.deposit(amount);
		
		
	}
	
	public final void performWithdraw(double amount, Account accountName) {
		amount = amount - transactionFee;
		System.out.println("Transaction fee =" + transactionFee);
		System.out.println("AMOUNT DEPOSITED SUCCESSFULLLY AFTER FEE : " + amount);
		accountName.withdraw(amount);
		
		
		
		
	}
	
	

}
