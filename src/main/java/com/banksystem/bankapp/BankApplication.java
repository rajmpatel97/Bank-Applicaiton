package com.banksystem.bankapp;

import java.util.Scanner;
import com.banksystem.dto.Account;
import com.banksystem.service.AccountHandlerService;
import com.banksystem.service.CustomerHandlerService;
import com.banksystem.service.TransactionService;

public class BankApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountHandlerService accountHandlerService = new AccountHandlerService();
		TransactionService transactionService = new TransactionService();
		Account account = new Account();
		int choice;
		double amount;

		do {
			System.out.println("1. New account");
			System.out.println("2. Deposite Transaction");
			System.out.println("3. Withdraw Transaction");
			System.out.println("4. View Account Information");
			System.out.println("5. Update Account or Customer Information");
			System.out.println("6. Exit");
			System.out.println("choice:");
			choice = input.nextInt();

			switch (choice) {

			case 1:
				account = accountHandlerService.openAccount();
				break;

			case 2:
				System.out.println("Enter the Deposit Amount: ");
				amount = input.nextDouble();
				transactionService.depositTransaction(account, amount);
				break;

			case 3:
				System.out.println("Enter the Withdraw Amount: ");
				amount = input.nextDouble();
				System.out.println(account);
				transactionService.withdrawTransaction(account, amount);
				break;

			case 4:
				System.out.println("Enter the Account Number: ");
				long aNumber = input.nextLong();
				System.out.println("Enter the Pin: ");
				String aPin = input.next();
				accountHandlerService.searchAccount(aNumber, aPin);
				break;

			case 5:
				break;

			case 6:
				break;

			default:
				System.out.println("Wrong choice!!");
			}
		} while (choice != 6);
		input.close();

	}
}
