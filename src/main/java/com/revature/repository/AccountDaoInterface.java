package com.revature.repository;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.DTO.AccountDTO;
import com.revature.repository.DTO.UserDTO;

public interface AccountDaoInterface {

//	CRUD
	
	AccountDTO selectAccountByID(Integer accountID);

	void updateAccountOwner(Account account, UserDTO member);

	void updateAccountOwner(AccountDTO convertAccountToAccountDTO, UserDTO convertUserToUserDTO);

	void updateAccountOwner(AccountDTO convertAccountToAccountDTO, User convertUserToUserDTO);

	
	void updateAccountOwner(Account account, Member member);
	
}
