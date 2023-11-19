package com.jian.singleton.lanhan2;

import java.util.Objects;

/**
 * @author: JianJian
 * @date: 2023/10/30 21:48
 * @description:懒汉式 安全
 */
public class Singleton04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(Objects.equals(instance2, instance));
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的共有方法，当使用到该方法时，才去创建instance
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
