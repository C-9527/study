package 策略模式.fly;

/**
 * @author : Shadow
 * @className : CanFly
 * @description :TODO
 * @date : 2021/01/21 14:36
 **/
public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("可以飞翔，飞的很高");
    }
}
