package com.jian.principle.singleresponsibility;

/**
 * @author: JianJian
 * @date: 2023/10/27 0:35
 * @description: 单一职责原则
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

    //交通工具类  方式1
    //1.在方式一种的run方法中   违反了单一职责原则
    //2.解决方案：分解为不同类即可
    static class Vehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + "在路上跑.....");
        }
    }
}
