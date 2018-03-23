package com.feng.ch04.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerformanceConfig.class);
		
		Performance p = context.getBean(Performance.class);
		p.perform();
		
		Encoreable e = (Encoreable)p;
		e.performEncore();
		
		context.close();
	}
}

//Silencing cell phones.
//Taking seats.
//Play is begining.
//CALP CLAP CLAP!!!
//Performing encore.