package com.learning.demo;

import com.learning.design.pattern.strategy.Context;
import com.learning.design.pattern.strategy.OperationAdd;
import com.learning.design.pattern.strategy.OperationMultiply;
import com.learning.design.pattern.strategy.OperationSubstract;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
