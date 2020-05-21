package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;



@RestController
@RequestMapping("/api")
public class AccountController {

	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}



	@GetMapping("/accounts")
	public ResponseEntity<Object> getAllAccounts()
	{
		return new ResponseEntity<>(accountService.getAccounts(),HttpStatus.OK);
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<AccountDto> getById(@PathVariable("id")Integer id)
	{
		return new ResponseEntity(accountService.getAccountById(id), HttpStatus.OK);
	}
	
	@PostMapping("/accounts")
	public ResponseEntity<AccountDto> saveAccount(@RequestBody AccountDto dto) {
		return new ResponseEntity(accountService.saveAccount(dto),HttpStatus.OK);
	}
	
	@PutMapping("/accounts")
	public ResponseEntity<AccountDto> updateAccount(@RequestBody Account account) {
		return new ResponseEntity(accountService.updateAccount(account), HttpStatus.OK);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<AccountDto> deleteAccount(@PathVariable("id") Integer id ){
		return new ResponseEntity(accountService.deleteAccount(id), HttpStatus.OK);
	}


	
}