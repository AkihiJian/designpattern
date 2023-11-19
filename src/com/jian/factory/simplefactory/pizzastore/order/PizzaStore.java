package com.jian.factory.simplefactory.pizzastore.order;

/**
 * @author: JianJian
 * @date: 2023/11/2 10:30
 * @description: 客户端
 */
public class PizzaStore {
    public static void main(String[] args) {
/*        OrderPizza orderPizza = new OrderPizza();
        System.out.println("订购完成");*/

        new OrderPizza(new SimpleFactory());
        System.out.println("订购完成");
    }

}
