package 策略模式.duck;

import 策略模式.barking.CanBarking;
import 策略模式.fly.GoodFly;

/**
 * @author : Shadow
 * @className : WildDuck
 * @description : 野生鸭子
 * @date : 2021/01/21 14:38
 **/
public class WildDuck extends Duck {

    public WildDuck() {
        setName("野鸭子");
        setFlyBehavior(new GoodFly());
        setBarkingBehavior(new CanBarking());
    }
}
