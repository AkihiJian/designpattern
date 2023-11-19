package com.jian.principle.inversion.improve;

/**
 * @author: JianJian
 * @date: 2023/10/27 11:39
 * @description:
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email() );

        person.receive(new WeiXin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello World";
    }
}
class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello WeiXin";
    }
}



//完成Person接受消息的功能
//问题：如果接受的对象是其他内容，需要新增类，同时Person也要新增相应的接受方法
//解决：引入抽象的接口IReceiver，表示接收者
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}