package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Account account=new Account();
		account.setAccountID(rs.getString("accountNumber"));
		account.setAccountType(rs.getString("accountType"));
		account.setInitialBalance(rs.getDouble("balance"));
		return account;
	}

}
