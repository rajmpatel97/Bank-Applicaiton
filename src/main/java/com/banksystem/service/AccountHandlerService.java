package com.banksystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.banksystem.dto.Account;
import com.banksystem.dto.ChequingAccount;
import com.banksystem.dto.CustomerInformation;
import com.banksystem.dto.SavingAccount;

public class AccountHandlerService{
	Scanner input = new Scanner(System.in);
	ChequingAccount chequingAccount;
	SavingAccount savingAccount;
	public static List<Account> accountList = new ArrayList<Account>();
	Account account;
	CustomerHandlerService customerHandlerService = new CustomerHandlerService();
	
	CustomerInformation customerInformation;

	long accountNumber;
	String pin;
	double balance;
	String accountHolderName;
	String accountType;

	public Account openAccount() {
		System.out.println("Enter the Account Number: ");
		accountNumber = input.nextLong();
		System.out.println("Enter the pin : ");
		pin = input.next();
		System.out.println("Enter the Opening Balance: ");
		balance = input.nextDouble();
		System.out.println("Enter the Account Type: ");
		accountType = input.next();
		
		
		customerHandlerService.createCustomerInformation();
		
		if (accountType.equals("CH")) {
			chequingAccount = new ChequingAccount(accountNumber, pin, balance, accountHolderName, accountType);
			account = chequingAccount;
			accountList.add(account);	

		} else if (accountType.equals("SA")) {
			savingAccount = new SavingAccount(accountNumber, pin, balance, accountHolderName, accountType);
			account = savingAccount;
			accountList.add(account);

		} else {
			System.out.println("Invalid type of Account!!!!!!!!");
			openAccount();
		}

		System.out.println(CustomerHandlerService.customerInformations.get(0).toString());
		
		return account;

	}

	public void searchAccount(long accountNumber, String pin) {

		List<Account> a = accountList.stream().filter(aa -> aa.accountNumber == accountNumber)
				.filter(aa -> aa.pin.equals(pin)).collect(Collectors.toList());
		List<Account> c = CustomerHandlerService.customerInformations.get(accountList.indexOf(account)).getAccountList().stream().filter(aa -> aa.accountNumber == accountNumber)
				.filter(aa -> aa.pin.equals(pin)).collect(Collectors.toList());	
		
		System.out.println("ac IND = :" + accountList.indexOf(a.get(0)));
		System.out.println(c.indexOf(c.get(0)));
		System.out.println(CustomerHandlerService.customerInformations.toString());
		
		if (!a.equals(null)) {
			Account accountDetails = a.get(0);
			System.out.println("Account Number:" + accountDetails.accountNumber);
			System.out.println("Account Type:" + accountDetails.accountType);
			System.out.println("Account Balance:" + accountDetails.balance);
			System.out.println("Customer ID: " + CustomerHandlerService.customerInformations.get(c.indexOf(c.get(0))).customerID);
			System.out.println("Customer Name: " + CustomerHandlerService.customerInformations.get(c.indexOf(c.get(0))).customerName);
			System.out.println("Customer Mobile Number: " + CustomerHandlerService.customerInformations.get(c.indexOf(c.get(0))).customerMobile);
		}

	}
	
	public void updateInformation() {
		
	}
}
