package 策略模式.fly;

/**
 * @author : Shadow
 * @className : BadFly
 * @description :TODO
 * @date : 2021/01/21 14:37
 **/
public class BadFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("可以飞翔但是飞的不高");
    }
}
