package com.jian.factory.absfactory.order;

import com.jian.factory.absfactory.pizza.LDCheesePizza;
import com.jian.factory.absfactory.pizza.LDPepperPizza;
import com.jian.factory.absfactory.pizza.Pizza;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:44
 * @description:
 */
public class LDFactory implements AbsFactory{


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        System.out.println("使用的是抽象工厂模式");
        return pizza;
    }
}
