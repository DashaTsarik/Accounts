package com.itacademy.java_classes.accounts;

public class CurrentAccount extends Account {
	
	public static final double OVERDRAFT_LIMIT = 1500;

	public CurrentAccount(int accountNumber) {
		super(accountNumber);
	}
	
	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public boolean withdraw(double amount) {
		double balanceAfterWithdraw = getBalance() - amount;
		if (balanceAfterWithdraw >= 0 - OVERDRAFT_LIMIT) {
			setBalance(balanceAfterWithdraw);
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	

}
