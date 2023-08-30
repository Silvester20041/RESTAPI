package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class  Details{
  @Id
  private int accountNo ;
  private int customerID;
  private String accountType;
  private float Balance;
  @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
  @JoinColumn(name="fk_transactionId")
  private List<Transaction> tr;
public Details() {
	super();
	// TODO Auto-generated constructor stub
}
public Details(int accountNo, int customerID, String accountType, float balance, List<Transaction> tr) {
	super();
	this.accountNo = accountNo;
	this.customerID = customerID;
	this.accountType = accountType;
	this.Balance = balance;
	this.tr = tr;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public float getBalance() {
	return Balance;
}
public void setBalance(float balance) {
	this.Balance = balance;
}
public List<Transaction> getTr() {
	return tr;
}
public void setTr(List<Transaction> tr) {
	this.tr = tr;
} 
  
 
}
