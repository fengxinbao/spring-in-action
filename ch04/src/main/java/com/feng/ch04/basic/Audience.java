package com.feng.ch04.basic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* com.feng.ch04.basic.Performance.perform(..))")
	public void performance(){}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("Silencing cell phones.");
		System.out.println("Taking seats.");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("CALP CLAP CLAP!!!");
	}

}
