package com.revature.services;

import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.UserDaoInterface;
import com.revature.repository.exceptions.UserNotFoundException;

public class UserService {
	
	private UserDaoInterface userDao;
	
	public UserService(UserDaoInterface userDao) {
		this.userDao = userDao;
	}

	public Member getMember(String username, String password) throws UserNotFoundException {
		
		return convertUserDtoToMember(userDao.getUser(username, password));
	}

	private Member convertUserDtoToMember(User user) {
		return new Member(user.getUserID(), user.getFirstName(), user.getLastName(), user.getUsername(), user.getPassword(), user.getEmail());
	}

}
