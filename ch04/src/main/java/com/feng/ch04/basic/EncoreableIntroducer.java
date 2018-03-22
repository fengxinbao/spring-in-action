package com.feng.ch04.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
	@DeclareParents(value="com.feng.ch04.basic.Performance+", defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
