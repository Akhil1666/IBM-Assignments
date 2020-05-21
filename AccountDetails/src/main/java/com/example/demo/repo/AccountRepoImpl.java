package com.example.demo.repo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
import com.example.demo.model.AccountRowMapper;

@Repository
public class AccountRepoImpl implements AccountRepo {
	
	private JdbcTemplate jdbcTemplate;
	private Logger logger=Logger.getLogger("AccountRepoImpl");
	
	@Autowired
	public AccountRepoImpl(JdbcTemplate jdbctemplate) {
		super();
		this.jdbcTemplate = jdbctemplate;
	}
	

	public void createAccount(Account account){
		// TODO Auto-generated method stub
		String query="insert into accounts(accountid,accounttype,balance) values('"+account.getAccountID()+"',"
				+ "'"+account.getAccountType()+"','"+account.getInitialBalance()+"')";
		int result=jdbcTemplate.update(query);
		if(result==0)
			System.out.println("Account not created due to some issues..");
		else
			System.out.println("Account created successfully...");
	}

	public Account displayAccountByID(String accountID) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from account where accountid=?", new Object[] {accountID},new AccountRowMapper());
	}
	
	public void updateAccountByID(String accountID,String accountType) {
		// TODO Auto-generated method stub
		String query="update accounts set accountype='"+accountType+"' where accountid='"+accountID+"'";
		int result=jdbcTemplate.update(query);
		if(result==0)
			 System.out.println("No such ID found on th DB");
		 else
			 System.out.println("account Updated successfully with id: "+accountID);

	}

	public void deleteAccountByID(String accountID) {
		// TODO Auto-generated method stub
		String str="delete from account where accountid='"+accountID+"'";
		 int result=jdbcTemplate.update(str);
		 if(result==0)
			 System.out.println("No such ID found on th DB");
		 else
			 System.out.println("account deleted successfully with id: "+accountID);

	}
	
	public List<Account> listAllAccountDetails() {
		// TODO Auto-generated method stub
		List<Account> accounts=jdbcTemplate.query("select * from account", new BeanPropertyRowMapper(Account.class));
		return accounts;
	}
	
	public void destroyBean()
	{
		//logger.ge
	}
	

}
