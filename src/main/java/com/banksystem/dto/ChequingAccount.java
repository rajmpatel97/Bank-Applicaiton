package com.banksystem.dto;

public class ChequingAccount extends Account {

	public ChequingAccount(long accountNumber, String pin, double balance, String accountHolderName,
			String accountType) {
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
}
