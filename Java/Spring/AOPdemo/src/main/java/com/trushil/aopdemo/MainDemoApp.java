package com.trushil.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.trushil.aopdemo.dao.AccountDAO;

public class MainDemoApp {
	public void addAccount() {
		System.out.println("Main method");
	}
	public static void main(String args[	]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO acc2 = new AccountDAO();
		acc2.addAccount(new Account());
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		Account account = context.getBean("account", Account.class);
		account.setName("Trushil");
		System.out.println(account.getName());
		accountDAO.addAccount(account);
//		MainDemoApp md = context.getBean("mainDemoApp", MainDemoApp.class);
//		md.addAccount();
		context.close();
	}
}
