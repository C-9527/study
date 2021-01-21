package 策略模式;

import 策略模式.duck.BeijingDuck;
import 策略模式.duck.Duck;
import 策略模式.duck.NanjingDuck;
import 策略模式.duck.WildDuck;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/21 14:45
 **/
public class Client {
    public static void main(String[] args) {
        Duck beijingDuck = new BeijingDuck();
        Duck nanjingDuck = new NanjingDuck();
        Duck wildDuck = new WildDuck();

        beijingDuck.fly();
        nanjingDuck.fly();
        wildDuck.fly();

        System.out.println("------------------");

        beijingDuck.barking();
        nanjingDuck.barking();
        wildDuck.barking();

    }
}
