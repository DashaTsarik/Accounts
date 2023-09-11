package com.itacademy.java_classes.accounts;

public class Main {

	public static void main(String[] args) {
		
		Account account = new Account(1,3500);
		account.deposit(345);
		System.out.println(account);
		
		account.withdraw(857);
		System.out.println(account);
		
		CurrentAccount account2 = new CurrentAccount(2);
		System.out.println(account2.OVERDRAFT_LIMIT);
		
		Account account3;
		account3 = account2;
		
		account3.deposit(560);
		account3.withdraw(600);
		System.out.println(account3);
		
		account3.withdraw(1600);
		System.out.println(account3);
		
		SavingsAccount account4 = new SavingsAccount(4, 589, 340);
		System.out.println(account4);
		
		account4.deposit(5000);
		account4.withdraw(200);
		account4.addInterest();
		System.out.println(account4);
		
		account4.payInterestOnDeposits();
		System.out.println(account4);
		
		account4.withdraw(2000);
		account4.renewSavingsAccount(370);
		System.out.println(account4);

	}

}
