package com.banksystem.service;

import java.util.Scanner;

import com.banksystem.dto.Account;

public class TransactionService {

	Scanner accountInput = new Scanner(System.in);
	long accountNumber;
	double accountBalance;

	public void depositTransaction(Account account, double amount) {

		System.out.println("Enter the Account Number :");
		accountNumber = accountInput.nextLong();
		if (account.accountNumber == accountNumber && account.accountType.equals("CH")) {
			accountBalance = account.balance + amount;
			account.balance = accountBalance;
		} else if (account.accountNumber == accountNumber && account.accountType.equals("SA")) {
			accountBalance = account.balance + amount;
			account.balance = accountBalance;
		} else {
			System.out.println("Account Not Found!!!");
		}
		System.out.println("Final Balance :" + accountBalance);
	}

	public void withdrawTransaction(Account account, double amount) {

		System.out.println("Enter the Account Number :");
		accountNumber = accountInput.nextLong();

		if (account.accountNumber == accountNumber && account.accountType.equals("CH")) {
			System.out.println("Account Balance" + account.balance);
			accountBalance = account.balance - amount;
			account.balance = accountBalance;
			System.out.println("Final Balance :" + accountBalance);
		} else if (account.accountNumber == accountNumber && account.accountType.equals("SA")) {
			System.out.println("Saving Account Balance" + account.balance);
			accountBalance = account.balance - amount;
			account.balance = accountBalance;
			System.out.println("Final Balance :" + accountBalance);
		} else {
			System.out.println("Account Not Found!!!");
		}

	}

}
