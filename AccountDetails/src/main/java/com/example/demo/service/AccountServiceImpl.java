package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepo;

public class AccountServiceImpl implements AccountService {

	private AccountRepo accountRepo;
	
	public AccountServiceImpl(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		accountRepo.createAccount(account);
	}

	@Override
	public Account displayAccountByID(String accountID) {
		// TODO Auto-generated method stub
		return accountRepo.displayAccountByID(accountID);
	}

	public void updateAccountByID(String accountID, String accountType) {
		// TODO Auto-generated method stub
		accountRepo.updateAccountByID(accountID, accountType);
	}

	@Override
	public void deleteAccountByID(String accountID) {
		// TODO Auto-generated method stub
		accountRepo.deleteAccountByID(accountID);
	}

	public List<Account> listAllAccountDetails() {
		// TODO Auto-generated method stub
		return accountRepo.listAllAccountDetails();
	}
	
}
