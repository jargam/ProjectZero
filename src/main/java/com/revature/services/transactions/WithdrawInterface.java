package com.revature.services.transactions;

import com.revature.models.Account;
import com.revature.models.Member;

public interface WithdrawInterface {

	boolean withdraw(Account account, Member member);
	
}
