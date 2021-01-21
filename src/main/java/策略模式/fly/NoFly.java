package 策略模式.fly;

/**
 * @author : Shadow
 * @className : NoFly
 * @description :TODO
 * @date : 2021/01/21 14:35
 **/
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("笨鸭子不可以飞翔哦");
    }
}
