package com.feng.ch04.basic;

import org.springframework.stereotype.Component;

@Component
public class Play implements Performance{

	public void perform() {
		System.out.println("Play is begining.");
	}

}
