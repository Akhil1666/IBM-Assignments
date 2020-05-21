package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	
	private AccountDAO accountDAO;

	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	@Override
	@Transactional
	public List<AccountDto> getAccounts() {
		
		List<AccountDto> accountList = new ArrayList<>();
		accountDAO.findAll().forEach(account -> {
		   accountList.add(new AccountDto(account.getAccountID(), account.getAccountType(),
				   account.getBalance()));
		  });

		  return accountList;
		 }

	@Override
	public AccountDto getAccountById(int id)
	{
		if (accountDAO.findById(id).isPresent()) {
			   Account account = accountDAO.findById(id).get();
			   AccountDto dto=new AccountDto(account.getAccountID(), account.getAccountType(),
					   account.getBalance());
			   return  dto;
			  } else {
			   return null;
			  }
		
	}

	@Override
	public  AccountDto saveAccount(AccountDto dto) {
		
		accountDAO.save(new Account(dto.getAccountID(),dto.getAccountType(),dto.getBalance()));
		return dto;
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountDto updateAccount(Account account) {
		if(accountDAO.findById(account.getAccoutNumber()).isPresent())
		{
			accountDAO.save(account);
			AccountDto dto=new AccountDto(account.getAccountID(), account.getAccountType(),
					   account.getBalance());
			
			return dto;
		}
		else
		return null;
	}

	@Override
	public AccountDto deleteAccount(int id) {
		
		if (accountDAO.findById(id).isPresent()) {
			   Account account = accountDAO.findById(id).get();
			   AccountDto dto=new AccountDto(account.getAccountID(), account.getAccountType(),
					   account.getBalance());
			   accountDAO.deleteById(id);
			   return  dto;
			  } else {
			   return null;
			  }
		
	}
	
	
}