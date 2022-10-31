package com.banksystem.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	public long accountNumber;
	public String pin;
	public double balance;
	public String accountHolderName;
	public String accountType;

}
