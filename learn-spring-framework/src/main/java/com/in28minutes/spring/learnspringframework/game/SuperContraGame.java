package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("SupeContraGame up");
	}
	
	public void down() {
		System.out.println("SupeContraGame down");
	}
	
	public void left() {
		System.out.println("SupeContraGame left");
	}
	
	public void right() {
		System.out.println("SupeContraGame right");
	}

}
