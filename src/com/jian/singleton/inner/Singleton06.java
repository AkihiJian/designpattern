package com.jian.singleton.inner;

import java.util.Objects;

/**
 * @author: JianJian
 * @date: 2023/10/30 21:48
 * @description:懒汉式 安全   推荐使用
 */
public class Singleton06 {
    public static void main(String[] args) {
        System.out.println("匿名内部类方式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(Objects.equals(instance2, instance));
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    //提供一个静态的共有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
