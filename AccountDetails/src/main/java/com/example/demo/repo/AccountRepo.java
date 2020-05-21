package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountRepo {
	public void createAccount(Account account);
	public Account displayAccountByID(String accountID);
	public void updateAccountByID(String accountID,String accountType);
	public void deleteAccountByID(String accountID);
	public List<Account> listAllAccountDetails();
}
