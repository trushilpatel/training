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

	public void setName(String name) {
		System.out.println("Name set: " + name);

		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
