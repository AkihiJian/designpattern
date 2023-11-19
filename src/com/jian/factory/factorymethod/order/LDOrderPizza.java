package com.jian.factory.factorymethod.order;

import com.jian.factory.factorymethod.pizzastore.*;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:02
 * @description:
 */

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            LDCheesePizza ldCheesePizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            LDPepperPizza ldPepperPizza = new LDPepperPizza();
        }
        return pizza;
    }
}
