package com.feng.ch04.basic;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class Audience {
	@Pointcut("execution(* com.feng.ch04.basic.Performance.perform(..))")
	public void performance(){}
	
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones.");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats.");
	}
	
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
}
