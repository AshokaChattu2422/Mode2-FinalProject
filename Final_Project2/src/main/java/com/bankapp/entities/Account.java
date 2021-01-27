package com.bankapp.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name= "account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private String name;
	private double balance;
	private LocalDate accountCreationDate;
	private String accountType;
	private String address;
	private String city;
	private String phone;
	private String email;
	private LocalDate dob;
	@JsonIgnore
	@JoinColumn(name="accountId_fk", nullable =false)
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<TransactionLog> transactionLogs =new ArrayList<>();
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getAccountCreationDate() {
		return accountCreationDate;
	}
	public void setAccountCreationDate(LocalDate accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate localDate) {
		this.dob = localDate;
	}
	public Account(String name, double balance, String accountType, String address, String city, String phone,
			String email, LocalDate dob) {
		super();
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		//this.accountCreationDate=LocalDate.now();
	}
	public Account() {
	
	}
	public List<TransactionLog> getTransactionLogs() {
		return transactionLogs;
	}
	public void setTransactionLogs(List<TransactionLog> transactionLogs) {
		this.transactionLogs = transactionLogs;
	}
	
	

}
