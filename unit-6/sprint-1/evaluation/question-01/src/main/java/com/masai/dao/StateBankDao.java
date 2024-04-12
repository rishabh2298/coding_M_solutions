package com.masai.dao;

import com.masai.model.Account;

public interface StateBankDao {
	
	public Account findAccountById(int id);
	
	public String saveAccount(Account account);
	
	public String deleteAccountById(int id);
	
	public String withDrawFromAccount(double amount, int accountId);
	
	public String depositeInAccount(double amount, int accountId);

}
