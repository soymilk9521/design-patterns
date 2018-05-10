package com.learning.demo;

import com.learning.design.pattern.template.Cricket;
import com.learning.design.pattern.template.Football;
import com.learning.design.pattern.template.Game;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();

	}

}
