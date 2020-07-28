package com.trushil.aopdemo;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyDemoLoggingAspect {
	@Pointcut("execution(* com.trushil.aopdemo.*.*(..))")
	private void forDAOpackage() {
	}

	@Pointcut("execution(* com.trusihl.aopdemo.*.get*(..))")
	private void removeGetLog() {
	}

	@Pointcut("execution(* com.trusihl.aopdemo.*.set*(..))")
	private void removeSetLog() {
	}

	@Pointcut("forDAOpackage() && !(removeGetLog() && removeSetLog())")
	private void methodLogging() {}
	
	@Before("methodLogging()")
	public void beforeAddAccount(JoinPoint jp) {
		System.out.println("============= Executing before add account");
		MethodSignature ms = (MethodSignature)jp.getSignature();
		Object[] args = jp.getArgs();
		
		for(Object o: args) {
			System.out.println(o);
		}
		System.out.println("Method signature :" + ms);
		
	}
	
	@AfterReturning(
			pointcut = "execution(* com.trushil.aopdemo.dao.AccountDAO.findAccount(..))",
			returning = "result"
			)
	public void daoLogging(JoinPoint jp, List<Account> result) {
		System.out.println("==================++++++++++++++DAO ligging is working");
		System.out.println("After returning the ");
		System.out.println(result);
		
	}
}
