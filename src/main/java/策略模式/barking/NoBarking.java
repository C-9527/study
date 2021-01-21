package 策略模式.barking;

/**
 * @author : Shadow
 * @className : NoBarking
 * @description :TODO
 * @date : 2021/01/21 14:47
 **/
public class NoBarking implements BarkingBehavior {

    @Override
    public void barking() {
        System.out.println("笨鸭鸭不会叫");
    }
}
