package com.trushil.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.trushil.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account) {
		System.out.println(getClass() + " Adding account/");
	}
}
