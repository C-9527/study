package 中介者模式.colleague;

import 中介者模式.mediator.Mediator;

/**
 * @author : Shadow
 * @className : Colleague
 * @description : 同事抽象类
 * @date : 2021/01/19 19:32
 **/
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
