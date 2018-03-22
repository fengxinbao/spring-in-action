package com.feng.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WhatPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public WhatPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		System.out.println("What's playing.");
	}

}
