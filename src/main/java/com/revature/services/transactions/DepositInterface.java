package com.revature.services.transactions;

import com.revature.models.Account;
import com.revature.models.Member;
import com.revature.models.User;

public interface DepositInterface {

	boolean Deposit(Account account, Member member);
	
}
