package com.revature.controller;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.LoginService;

public class UserController implements UserInputInterface, LoginInterface{

	private Scanner sc;
	private LoginService loginService;
	
	
	
	public UserController(Scanner sc, LoginService loginService) {
		super();
		this.sc = sc;
		this.loginService = loginService;
	}

	public User validateLogin(String username, String password) {
		
		if(username == null && password == null) {
			return null;
		}
		
		User user = null;
		try {
			user = loginService.login(username, password);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
		
	}
	
	public String verifyUser() {
		System.out.println("Are you a Member, Admin, or Employee?");
		return sc.nextLine();
		
	}

	public String getUserInput() {
		System.out.println("Enter your username\n");
		return sc.nextLine();
	}

	public String getUserInput2() {
		System.out.println("Enter your password\n");
		return sc.nextLine();
	}

	public void login() {
		System.out.println("Welcome to FirstOne Bank! Please login below.\n");
		String username = getUserInput();
		String password = getUserInput2();
		User user = validateLogin(username, password);
		
		if(user != null) {
			System.out.println("Login successful!");
			System.out.println("Welcome "+user.getFirstName()+ " "+ user.getLastName());
		}else {
			System.out.println("Login failed! :(");
		}
	}
	
	

}
