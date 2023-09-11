package com.itacademy.java_classes.accounts;

import java.util.Objects;

public class SavingsAccount extends Account{
	
	private int depositPlacementPeriodInDays;
	private double interestRatePerYear;

	public SavingsAccount(int accountNumber, double balance, int depositPlacementPeriodInDays) {
		super(accountNumber, balance);
		this.depositPlacementPeriodInDays = depositPlacementPeriodInDays;
		if (this.depositPlacementPeriodInDays > 365 || getBalance() > 5000) {
			this.interestRatePerYear = 3.5;
		} else {
			this.interestRatePerYear = 1.5;
		}
	}

	public int getDepositPlacementPeriodInDays() {
		return depositPlacementPeriodInDays;
	}

	public double getInterestRatePerYear() {
		return interestRatePerYear;
	}

	public void addInterest() {
		if(getBalance() > 5000) {
			interestRatePerYear = 3.5;
		}
	}
	
	public void payInterestOnDeposits() {
		double balance = getBalance() + getBalance() * (interestRatePerYear / 100) * 
			 	         depositPlacementPeriodInDays / 365;
		zeroOutSavingsAccount();
		setBalance(balance);
	}
	
	private void zeroOutSavingsAccount() {
		this.depositPlacementPeriodInDays = 0;
		this.interestRatePerYear = 0;
	}
	
	public void renewSavingsAccount(int depositPlacementPeriodInDays) {
		if (this.depositPlacementPeriodInDays == 0 && this.interestRatePerYear == 0) {
			if (depositPlacementPeriodInDays > 365 || getBalance() > 5000) {
				this.depositPlacementPeriodInDays = depositPlacementPeriodInDays;
				this.interestRatePerYear = 3.5;
			} else {
				this.depositPlacementPeriodInDays = depositPlacementPeriodInDays;
				this.interestRatePerYear = 1.5;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(depositPlacementPeriodInDays, interestRatePerYear);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return depositPlacementPeriodInDays == other.depositPlacementPeriodInDays
				&& Double.doubleToLongBits(interestRatePerYear) == Double.doubleToLongBits(other.interestRatePerYear);
	}

	@Override
	public String toString() {
		return "SavingsAccount [depositPlacementPeriodInDays=" + depositPlacementPeriodInDays + ", interestRatePerYear="
				+ interestRatePerYear + ", AccountNumber=" + getAccountNumber() + ", Balance=" + getBalance()
				+ "]";
	}
	
	
	
	
	

}
