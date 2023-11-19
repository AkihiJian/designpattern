package com.jian.factory.simplefactory.pizzastore.pizza;

/**
 * @author: JianJian
 * @date: 2023/11/2 9:57
 * @description:
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("希腊披萨  准备原材料");
    }
}
