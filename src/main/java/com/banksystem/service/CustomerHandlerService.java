package com.banksystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.banksystem.dto.Account;
import com.banksystem.dto.CustomerInformation;

public class CustomerHandlerService {

	int customerID, customerPancardId;
	String customerName, customerMobile, customerAddress, customerEmail, customerUsername;
	int streetNo;
	String streetName, pincode, city, state, country;

	Scanner input = new Scanner(System.in);
	CustomerInformation customerInformation;
	public static List<CustomerInformation> customerInformations = new ArrayList<CustomerInformation>();

	public void createCustomerInformation() {
		System.out.println("Enter the Customer ID: ");
		customerID = input.nextInt();
		System.out.println("Enter the Account Holder Name: ");
		customerName = input.next();
		System.out.println("Enter the Customer Mobile ");
		customerMobile = input.next();
		
		
		customerInformation = new CustomerInformation(customerID, customerName, customerMobile, streetNo, streetName,
				pincode, city, state, country);
		
		customerInformations.add(customerInformation);
		
		customerInformation.setAccountList(AccountHandlerService.accountList);
		
		
		
	}
	
	public void serachCustomerInformation(){
		
			//customerInformation.getAccountList().stream()
		
		
			//System.out.println("Customer Name:" + AccountHandlerService.accountList.get(0).accountType);
//			System.out.println("Customer ID:" + customerInformation.customerID);
//			System.out.println("Customer Mobile:" + customerInformation.customerMobile);
//			System.out.println("Customer Address:" + customerInformation.);
	}

}
