package com.Assignment_01;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("This much acounts are there :" + Bank.totalAccounts);
		
		SavingsAccount sa= new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
		Transaction t = new Transaction();
		
		t.performDeposite(10000, sa);
		sa.display();
		
		t.performDeposite(9000, ca);
		ca.display();
		
		t.performWithdraw(8000, ca);
		ca.display();
		
		
		
	}
	

}
