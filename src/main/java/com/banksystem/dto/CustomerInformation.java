package com.banksystem.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerInformation {

	public int customerID, customerPancardId;
	public String customerName, customerMobile, customerEmail, customerUsername;
	public Address customerAddress;
	
	List<Account> accountList;
	

	public CustomerInformation(int customerID, String customerName, String customerMobile,int streetNo, String streetName, String pincode, String city, String state, String country)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		customerAddress = new Address(streetNo, streetName, pincode, city, state, country);
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

		public String toString() {
		return "CustomerInformation [customerID=" + customerID + ", customerPancardId=" + customerPancardId
				+ ", customerName=" + customerName + ", customerMobile=" + customerMobile + ", customerEmail="
				+ customerEmail + ", customerUsername=" + customerUsername + ", cusotmerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", accountList=" + accountList + "]";
	}
	
}
