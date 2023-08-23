package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Details {
       @Id
       @GeneratedValue
       private int AccNumber;
       private String AccName;
       private int  Balance;
       private int PhoneNo;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int accNumber, String accName, int balance, int phoneNo) {
		super();
		AccNumber = accNumber;
		AccName = accName;
		Balance = balance;
		PhoneNo = phoneNo;
	}
	public int getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(int accNumber) {
		AccNumber = accNumber;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	   
       
	
       
}
