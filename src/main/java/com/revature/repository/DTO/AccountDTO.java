package com.revature.repository.DTO;

import java.util.Objects;

public class AccountDTO {

	private Integer account_id;
	
	private Integer balance;
	
	private String account_type;
	
	private boolean approved;

	public AccountDTO(Integer account_id, Integer balance, String account_type, boolean approved) {
		super();
		this.account_id = account_id;
		this.balance = balance;
		this.account_type = account_type;
		this.approved = approved;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account_id, account_type, approved, balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDTO other = (AccountDTO) obj;
		return Objects.equals(account_id, other.account_id) && Objects.equals(account_type, other.account_type)
				&& approved == other.approved && Objects.equals(balance, other.balance);
	}

	@Override
	public String toString() {
		return "AccountDTO [account_id=" + account_id + ", balance=" + balance + ", account_type=" + account_type
				+ ", approved=" + approved + "]";
	}
	
	
	
	
}
