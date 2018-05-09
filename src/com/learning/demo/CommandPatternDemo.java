package com.learning.demo;

import com.learning.design.pattern.command.Broker;
import com.learning.design.pattern.command.BuyStock;
import com.learning.design.pattern.command.SellStock;
import com.learning.design.pattern.command.Stock;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

	}

}
