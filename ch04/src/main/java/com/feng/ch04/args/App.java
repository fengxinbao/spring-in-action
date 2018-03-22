package com.feng.ch04.args;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);
		
		CompactDisc cd = context.getBean(CompactDisc.class);
		TrackCounter counter = context.getBean(TrackCounter.class);
		
		for (int i = 0; i < 10; i++) {
			cd.playTrack((int) Math.floor(Math.random() * 3));
		}
		
		Map<Integer, Integer> map = counter.getTrackCounts();
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		context.close();
	}
}
