package com.learning.demo;

import com.learning.design.pattern.visitor.Computer;
import com.learning.design.pattern.visitor.ComputerPart;
import com.learning.design.pattern.visitor.ComputerPartDisplayVisitor;
import com.learning.design.pattern.visitor.Mouse;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
		
		System.out.println();
		
		ComputerPart mouse = new Mouse();
		mouse.accept(new ComputerPartDisplayVisitor());

	}

}
