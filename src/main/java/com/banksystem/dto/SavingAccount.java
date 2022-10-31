package com.banksystem.dto;

public class SavingAccount extends Account {
	
	public SavingAccount(long accountNumber, String pin, double balance, String accountHolderName, String accountType) {
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
}
