package com.jian.singleton.ehan1.ehan2;

import java.util.Objects;

/**
 * @author: JianJian
 * @date: 2023/10/30 18:03
 * @description:饿汉式，静态常量方法
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(Objects.equals(instance2, instance));
    }
}


class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){
    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    //在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    //3.对外提供静态的共有方法
    public static Singleton getInstance(){
        return instance;
    }


}
