package com.feng.ch04.basic;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable{

	@Override
	public void performEncore() {
		System.out.println("Performing encore.");
	}

}
