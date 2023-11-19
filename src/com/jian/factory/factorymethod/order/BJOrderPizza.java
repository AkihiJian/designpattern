package com.jian.factory.factorymethod.order;

import com.jian.factory.factorymethod.pizzastore.BJCheesePizza;
import com.jian.factory.factorymethod.pizzastore.BJPepperPizza;
import com.jian.factory.factorymethod.pizzastore.Pizza;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:02
 * @description:
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}