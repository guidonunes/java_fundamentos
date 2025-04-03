package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.PacManGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new PacManGame();
		GamingConsole game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
		
	}

}
