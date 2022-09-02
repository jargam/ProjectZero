package com.revature.models;

import java.util.Objects;

public class Account {

	protected Integer accountID;
	
	protected Integer balance;
	
	protected String accountType;
	
	protected boolean approved;

	public Account(Integer accountID, Integer balance, String accountType, boolean approved) {
		super();
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
		this.approved = approved;
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountID, accountType, approved, balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountID, other.accountID) && Objects.equals(accountType, other.accountType)
				&& approved == other.approved && Objects.equals(balance, other.balance);
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", balance=" + balance + ", accountType=" + accountType
				+ ", approved=" + approved + "]";
	}
	
	
	
	
}
