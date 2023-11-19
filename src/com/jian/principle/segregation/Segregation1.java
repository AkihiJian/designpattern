package com.jian.principle.segregation;

/**
 * @author: JianJian
 * @date: 2023/10/27 1:11
 * @description:
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B 中实现了操作 1");
    }

    @Override
    public void operation2() {
        System.out.println("B 中实现了操作 2");
    }

    @Override
    public void operation3() {
        System.out.println("B 中实现了操作 3");
    }

    @Override
    public void operation4() {
        System.out.println("B 中实现了操作 4");
    }

    @Override
    public void operation5() {
        System.out.println("B 中实现了操作 5");
    }
}

class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
}


class C {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend4(Interface1 i){
        i.operation4();
    }

    public void depend5(Interface1 i){
        i.operation5();
    }

}
