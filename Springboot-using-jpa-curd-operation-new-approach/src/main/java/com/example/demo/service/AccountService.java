package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;

public interface AccountService {
	
	public List<AccountDto> getAccounts();
	public AccountDto getAccountById(int id); 
	public AccountDto saveAccount(AccountDto dto);
	public AccountDto updateAccount(Account account);
	public AccountDto deleteAccount(int id);
}