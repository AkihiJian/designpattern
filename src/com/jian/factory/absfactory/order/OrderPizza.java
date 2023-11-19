package com.jian.factory.absfactory.order;

import com.jian.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:45
 * @description:
 */
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType = "";
      this.absFactory = absFactory;
        do {
            orderType = getType();
            Pizza absFactoryPizza = absFactory.createPizza(orderType);
            if (null != absFactoryPizza) {
                absFactoryPizza.prepare();
                absFactoryPizza.bake();
                absFactoryPizza.cut();
                absFactoryPizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
