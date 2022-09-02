package com.revature.services.transactions;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.AccountDao;
import com.revature.repository.AccountDaoInterface;
import com.revature.repository.UserDao;
import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.AccountService;
import com.revature.services.DTOConversionService;
import com.revature.services.LoginService;
import com.revature.services.UserService;

public class WithdrawService implements WithdrawInterface{
	
	private AccountDaoInterface accountDao;
	private DTOConversionService dtoConversionService;
	
	public WithdrawService(AccountDaoInterface accountDao, DTOConversionService dtoConversionService) {
		this.accountDao = accountDao;
		this.dtoConversionService = dtoConversionService;
	}
	
	public static void main(String[] args) throws UserNotFoundException {
		
		UserDao uDao = new UserDao();
		
		AccountDao aDao = new AccountDao();
		LoginService lS = new LoginService(uDao);
		
		UserService uS = new UserService(uDao);
		
		AccountService aS = new AccountService();
		
		WithdrawService wS = new WithdrawService(aDao, new DTOConversionService(aDao, uDao));
		wS.withdraw(aS.convertAccountDTO(aDao.selectAccountByID(1)), uS.getMember("user1", "pass1"));
	
	}

	@Override
	public boolean withdraw(Account account, Member member) {
//		Check to see if user has enough money
//		If they do, let them withdraw and update balance
		
		if(account.getBalance() < 0) {
			System.out.println("Insufficient funds");
			return false;
		}else {
			System.out.println("Withdraw Successful");
			System.out.println(account);
			
			accountDao.updateAccountOwner(
					dtoConversionService.convertAccountToAccountDTO(account), 
					dtoConversionService.convertUserToUserDTO(member));
			
			return true;
		}
	}

}
