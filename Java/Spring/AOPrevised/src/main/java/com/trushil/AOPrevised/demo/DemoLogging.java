package com.trushil.AOPrevised.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.trushil.AOPrevised.entity.Customer;

@Aspect
@Component
public class DemoLogging {
	
	@Around("execution(* com.trushil.AOPrevised.demo.*.*(..))")
	public void logging(ProceedingJoinPoint jp) {
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
