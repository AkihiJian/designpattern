package com.jian.factory.simplefactory.pizzastore.order;

import com.jian.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: JianJian
 * @date: 2023/11/2 10:01
 * @description:
 */
public class OrderPizza {

/*    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType  = gettype();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println("Pizza订购完成");
        }while (true);

    }*/

    SimpleFactory simpleFactory;
    Pizza pizza = null;
    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
         setSimpleFactory(simpleFactory);
    }
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = gettype();

        this.simpleFactory = simpleFactory;

        do {
            pizza = this.simpleFactory.createPizza(orderType);
            if (null != pizza){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");

            }
        }while (true);

    }


    //用于获取客户希望订购的披萨种类
    private String gettype(){
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