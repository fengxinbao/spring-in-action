package com.feng.ch02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MediaPlayerConfig.class);
		MediaPlayer player = context.getBean(CDPlayer.class);
		player.play();
		player = context.getBean(WhatPlayer.class);
		player.play();
		context.close();
	}
}
