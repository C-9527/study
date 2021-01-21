package 策略模式.barking;

/**
 * @author : Shadow
 * @className : CanBarking
 * @description :TODO
 * @date : 2021/01/21 14:49
 **/
public class CanBarking implements BarkingBehavior {
    @Override
    public void barking() {
        System.out.println("会嘎嘎嘎地叫");
    }
}
