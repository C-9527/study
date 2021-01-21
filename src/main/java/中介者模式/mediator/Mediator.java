package 中介者模式.mediator;

import 中介者模式.colleague.Colleague;

/**
 * @author : Shadow
 * @className : Mediator
 * @description :TODO
 * @date : 2021/01/19 19:32
 **/
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}

