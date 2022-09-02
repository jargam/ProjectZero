package com.revature.models;

import com.revature.repository.exceptions.UserNotFoundException;

public interface UserInterface {

	User login(String username, String password) throws UserNotFoundException;
	
	boolean logout();
	
	boolean deleteAccount();
	
	boolean updateAccount(Account updatedAccount);
	
}
