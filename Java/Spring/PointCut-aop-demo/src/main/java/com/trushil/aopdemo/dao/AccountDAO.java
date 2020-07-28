package com.trushil.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trushil.aopdemo.Account;

@Component
public class AccountDAO {
	
	public List<Account> findAccount() {
		List<Account> accounts = new ArrayList<Account>();
				
		accounts.add(new Account("Trushil", "1"));
		accounts.add(new Account("Harshil", "2"));
		accounts.add(new Account("Sangita", "3"));
		accounts.add(new Account("Prahlad", "4"));
		
		
		return accounts;
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + " Adding account/");
	}
}
