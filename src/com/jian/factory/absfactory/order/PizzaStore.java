package com.jian.factory.absfactory.order;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:54
 * @description:
 */
public class PizzaStore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
