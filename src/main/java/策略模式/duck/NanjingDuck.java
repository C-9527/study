package 策略模式.duck;

import 策略模式.fly.BadFly;

/**
 * @author : Shadow
 * @className : NanjingDuck
 * @description :
 * @date : 2021/01/21 14:35
 **/
public class NanjingDuck extends Duck{
    public NanjingDuck() {
        setName("南京鸭");
        // 选择不同的策略
        setFlyBehavior(new BadFly());
    }
}
