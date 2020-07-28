package com.trushil.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

	@Pointcut("forDAOpackage() && !(removeGetLog() || removeSetLog())")
	private void methodLogging() {}
	
	@Before("methodLogging()")
	public void beforeAddAccount() {
		System.out.println("============= Executing before add account");
	}
}
