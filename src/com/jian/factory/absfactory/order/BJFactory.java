package com.jian.factory.absfactory.order;

import com.jian.factory.absfactory.pizza.BJCheesePizza;
import com.jian.factory.absfactory.pizza.BJPepperPizza;
import com.jian.factory.absfactory.pizza.Pizza;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:38
 * @description:
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        System.out.println("使用的是抽象工厂模式");
        return pizza;
    }
}
