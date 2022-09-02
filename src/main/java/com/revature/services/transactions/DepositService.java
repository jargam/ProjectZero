package com.revature.services.transactions;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.AccountDao;
import com.revature.repository.AccountDaoInterface;
import com.revature.repository.UserDao;
import com.revature.services.AccountService;
import com.revature.services.DTOConversionService;
import com.revature.services.LoginService;
import com.revature.services.UserService;

public class DepositService implements DepositInterface{

	private AccountDaoInterface accountDao;
	private DTOConversionService dtoConversionService;
	
	public DepositService(AccountDaoInterface accountDao, DTOConversionService dtoConversionService) {
		this.accountDao = accountDao;
		this.dtoConversionService = dtoConversionService;
	}
	
	 public static void main(String[] args) {
		 UserDao uDao = new UserDao();
		
		 AccountDao aDao = new AccountDao();
		 LoginService lS = new LoginService(uDao);
		 
		 UserService uS = new UserService(uDao);
		 
		 AccountService aS = new AccountService();
		 
		 DepositService dS = new DepositService(aDao, new DTOConversionService(aDao, new UserDao()));
		 dS.Deposit(aS.convertAccountDTO(aDao.selectAccountByID(2)), lS.getMember("user2", "pass2"));
	}
	
	@Override
	public boolean Deposit(Account account, Member member) {
		System.out.println("Adding deposit to your account");
		System.out.println(account);
		
		
		return true;
	}

}
