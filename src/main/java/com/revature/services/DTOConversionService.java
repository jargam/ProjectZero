package com.revature.services;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.AccountDaoInterface;
import com.revature.repository.UserDaoInterface;
import com.revature.repository.DTO.AccountDTO;
import com.revature.repository.DTO.UserDTO;

public class DTOConversionService {
	
	private AccountDaoInterface aDao;
	private UserDaoInterface uDao;

	

	public DTOConversionService(AccountDaoInterface aDao, UserDaoInterface uDao) {
		super();
		this.aDao = aDao;
		this.uDao = uDao;
	}

	public AccountDTO convertAccountToAccountDTO(Account account) {
		return aDao.selectAccountByID(account.getAccountID());
		
	}

	public User convertUserToUserDTO(User member) {
		
		return uDao.selectUserByID(member.getUserID());
	}

	public void updateAccountOwner(AccountDTO convertAccountToAccountDTO, User convertUserToUserDTO) {
		// TODO Auto-generated method stub
		
	}

	
	
}
