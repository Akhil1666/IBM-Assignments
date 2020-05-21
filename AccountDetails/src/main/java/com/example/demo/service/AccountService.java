package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService {
	public void createAccount(Account account);
	public Account displayAccountByID(String accountID);
	public void updateAccountByID(String accountID,String accountType);
	public void deleteAccountByID(String accountID);
	public List<Account> listAllAccountDetails();
}
