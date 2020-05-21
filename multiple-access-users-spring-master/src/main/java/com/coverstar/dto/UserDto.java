package com.coverstar.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.coverstar.validator.PasswordMatches;
import com.coverstar.validator.ValidEmail;
import com.coverstar.validator.ValidPassword;
import com.coverstar.validator.ValidUsername;

@PasswordMatches
@ValidPassword
public class UserDto {

	@NotNull
	@NotEmpty
	private String firstname;

	@NotNull
	@NotEmpty
	private String lastname;

	@ValidUsername
	@NotNull
	@NotEmpty
	private String username;

	@ValidEmail
	@NotNull
	@NotEmpty
	private String email;

	@NotNull
	@NotEmpty
	private String password;
	
	@NotNull
	@NotEmpty
	private String matchingPassword;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

}
