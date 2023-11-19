package com.jian.factory.simplefactory.pizzastore.pizza;

/**
 * @author: JianJian
 * @date: 2023/11/2 9:56
 * @description:
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("奶酪披萨，准备原材料");
    }
}
