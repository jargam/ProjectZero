package com.revature.services;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;
import com.revature.models.UserInterface;
import com.revature.repository.UserDaoInterface;
import com.revature.repository.exceptions.UserNotFoundException;

public class LoginService implements UserInterface{

	private UserDaoInterface userDao;
	
	
	
	public LoginService(UserDaoInterface userDao) {
		super();
		this.userDao = userDao;
	}

	public User login(String username, String password) throws UserNotFoundException {
		return userDao.getUser(username, password);
	}

	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAccount(Account updatedAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	public Member getMember(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
