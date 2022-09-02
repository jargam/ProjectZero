package com.revature.services;

import com.revature.models.Account;
import com.revature.repository.DTO.AccountDTO;

public class AccountService implements AccountServiceInterface{

	@Override
	public Account convertAccountDTO(AccountDTO accountDTO) {
		return new Account(
				accountDTO.getAccount_id(),
				accountDTO.getBalance(),
				accountDTO.getAccount_type(),
				accountDTO.isApproved()
				);
	}
	
	}


