package com.itacademy.java_classes.accounts;

import java.util.Objects;

public class Account {
	
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0.0;
	}
	
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		} 
		balance = balance - amount;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	
}
