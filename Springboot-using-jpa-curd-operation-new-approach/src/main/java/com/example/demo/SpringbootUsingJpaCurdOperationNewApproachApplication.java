package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AccountDAO;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@SpringBootApplication
public class SpringbootUsingJpaCurdOperationNewApproachApplication implements CommandLineRunner
{
   
	private AccountDAO accountDAO;
	private AccountService accountService;
	
	public SpringbootUsingJpaCurdOperationNewApproachApplication(AccountDAO accountDAO, AccountService accountService) {
		super();
		this.accountDAO = accountDAO;
		this.accountService = accountService;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootUsingJpaCurdOperationNewApproachApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Savings", 5000));
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Credit Card", 4000));
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Loan", 20000));
		System.out.println(accountService.getAccounts().toString());
		
	}

}
