package com.universe.design.behavioral.mediator;

/**
 * @author
 * @version v1.1.0
 * @Description 具体同事类2
 * @since jdk1.8
 */
public class ConcreteColleague2 extends Colleague {
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
