package com.revature.services;

import com.revature.models.Account;
import com.revature.repository.DTO.AccountDTO;

public interface AccountServiceInterface {

	Account convertAccountDTO(AccountDTO accountDTO);
	
}
