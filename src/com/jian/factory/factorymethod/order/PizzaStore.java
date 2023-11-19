package com.jian.factory.factorymethod.order;

import com.jian.factory.factorymethod.pizzastore.Pizza;

import java.util.Scanner;

/**
 * @author: JianJian
 * @date: 2023/11/6 2:07
 * @description:
 */
public class PizzaStore {

    public static void main(String[] args) {
        System.out.println("请输入想要的披萨地区：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("bj")){
            new BJOrderPizza();
        }else if (s.equals("ld")){
            new LDOrderPizza();
        }
        System.out.println("订购完成");
    }
}
