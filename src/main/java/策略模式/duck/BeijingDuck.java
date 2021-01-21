package 策略模式.duck;

import 策略模式.barking.NoBarking;
import 策略模式.fly.NoFly;

/**
 * @author : Shadow
 * @className : BeijingDuck
 * @description :TODO
 * @date : 2021/01/21 14:34
 **/
public class BeijingDuck extends Duck {

    public BeijingDuck() {
        setName("北京鸭");
        setFlyBehavior(new NoFly());
        setBarkingBehavior(new NoBarking());
    }
}
