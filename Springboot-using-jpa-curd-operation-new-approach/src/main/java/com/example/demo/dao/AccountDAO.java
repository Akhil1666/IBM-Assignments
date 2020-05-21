package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Account;

@Repository(value = "accountDAO")
public interface AccountDAO extends CrudRepository<Account, Integer>
{

}
