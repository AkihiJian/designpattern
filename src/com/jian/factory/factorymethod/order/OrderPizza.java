package com.jian.factory.factorymethod.order;

import com.jian.factory.factorymethod.pizzastore.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: JianJian
 * @date: 2023/11/6 1:49
 * @description:
 */
public abstract class OrderPizza {

    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); //createPizza是个抽象方法，可以由它的子类去实现具体的操作
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }

    //用于获取客户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String line = bufferedReader.readLine();
            return line;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}



