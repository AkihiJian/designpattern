package com.jian.factory.absfactory.order;

import com.jian.factory.absfactory.pizza.Pizza;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:36
 * @description: 一个抽象工厂模式的抽象层
 */
public interface AbsFactory {

    public Pizza createPizza(String orderType);

}
