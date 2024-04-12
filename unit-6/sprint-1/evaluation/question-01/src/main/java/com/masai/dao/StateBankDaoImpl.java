package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.model.Account;

public class StateBankDaoImpl implements StateBankDao {

	@Override
	public Account findAccountById(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Account account = em.find(Account.class, id);
		
		em.getTransaction().commit();
		
		em.close();
		
		return account;
	}
	

	@Override
	public String saveAccount(Account account) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		String message = null;
		
		if(account!=null) {
			em.persist(account);
			message = "account saved in database";
		}
		else {
			message = "fail to save account";
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	}

	
	@Override
	public String deleteAccountById(int id) {
	
		String message = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Account account = em.find(Account.class, id);
		
		if(account!=null) {
			em.remove(account);
			message = "Account deleted successfully";
		}
		else {
			message = "This account does not exist";
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	}


	@Override
	public String withDrawFromAccount(double amount, int accountId) {
		
		String message = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Account account = em.find(Account.class, accountId);
		
		if(account!=null) {
			
			double balance = account.getBalance();
			
			if(amount<=balance && amount>=0) {
				
				balance = balance-amount;
				
				message = "amount "+amount+" is deducted from accountId = "+accountId;
				
				account.setBalance(balance);
			}
			else {
				message = "Insufficient Balance";
			}
		}
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	}

	
	@Override
	public String depositeInAccount(double amount, int accountId) {
		
		String message = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Account account = em.find(Account.class, accountId);
		
		if(account!=null) {
			
			double balance = account.getBalance();
			
			account.setBalance(balance+amount);
			
			message = "Your amount = "+amount+" is deposited to Acount Id = "+accountId;
			
			em.persist(account);
		}
		else {
			message = "No such account in database";
		}
		
		
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	}

}
