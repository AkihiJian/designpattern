package com.jian.singleton.doublecheck;

import java.util.Objects;

/**
 * @author: JianJian
 * @date: 2023/10/30 21:48
 * @description:懒汉式 安全   推荐使用
 */
public class Singleton05 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(Objects.equals(instance2, instance));
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    //写一个静态内部类，其中有一个静态属性 Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }


    //提供一个静态的共有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
