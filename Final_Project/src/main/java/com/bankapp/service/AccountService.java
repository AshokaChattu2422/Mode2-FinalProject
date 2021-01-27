package com.bankapp.service;

import java.util.*;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;


public interface AccountService {
	public List<Account> getAll();
	public Account getAccountId(int id);
	public Account Save(Account account);
	public Account delete(int id);
	public void transfer (int fromId, int toId, double balance);
	public void changeAddress(int fromId, AddressChangeRequest request );
	public void deposit(int id, double amount);
	public void withdraw(int id, double amount);
	public Account update(int id, Account account);
	public Account getAccountById(int id);
	

}
