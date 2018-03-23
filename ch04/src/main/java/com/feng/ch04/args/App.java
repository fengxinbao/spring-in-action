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

//Playing track 0: With a Little Help from My Friends
//Playing track 0: With a Little Help from My Friends
//Playing track 1: Lucy in the Sky with the Diamonds
//Playing track 2: Fixing a Hole
//Playing track 1: Lucy in the Sky with the Diamonds
//Playing track 2: Fixing a Hole
//Playing track 0: With a Little Help from My Friends
//Playing track 2: Fixing a Hole
//Playing track 0: With a Little Help from My Friends
//Playing track 2: Fixing a Hole
//0:4
//1:2
//2:4