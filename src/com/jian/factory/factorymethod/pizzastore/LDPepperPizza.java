package com.jian.factory.factorymethod.pizzastore;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		Pizza pizza = null;
		pizza.setName("伦敦的胡椒披萨");
		System.out.println(" 伦敦的胡椒pizza 准备原材料");
	}
}
