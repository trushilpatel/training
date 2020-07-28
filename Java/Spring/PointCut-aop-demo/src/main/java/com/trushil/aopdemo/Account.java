package com.trushil.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private String name;
	private String level;

	Account() {
	}

	public String getName() {
		return name;
	}
 
	public Account(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + "]";
	}

	public void setName(String name) {
		System.out.println("Setting name :" + name);
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
