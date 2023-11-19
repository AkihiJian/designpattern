package com.jian.prototype.improve;

import com.jian.prototype.improve.Sheep;

/**
 * @author: JianJian
 * @date: 2023/11/7 10:45
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1,"白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println("Sheep2:" + sheep2);
        System.out.println("Sheep3:" + sheep3);
        System.out.println("Sheep4:" + sheep4);

    }

}
