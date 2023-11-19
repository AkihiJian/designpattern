package com.jian.principle.singleresponsibility;

/**
 * @author: JianJian
 * @date: 2023/10/27 0:35
 * @description: 单一职责原则
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
    }

    //交通工具类  方式3
    //1. 没有对原来的类做大的修改，只是增加方法
    //2. 没有在类的级别上遵守单一职责，但是在方法级别上，仍然遵守单一职责
    static class Vehicle2 {
        public void run(String vehicle) {
            System.out.println(vehicle + "在路上跑.....");
        }

        public void runAir(String vehicle) {
            System.out.println(vehicle + "在天上飞.....");
        }
    }


}
