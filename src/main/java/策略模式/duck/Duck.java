package 策略模式.duck;

import 策略模式.barking.BarkingBehavior;
import 策略模式.fly.FlyBehavior;

/**
 * @author : Shadow
 * @className : Duck
 * @description :TODO
 * @date : 2021/01/21 14:31
 **/
public abstract class Duck {
    private String name;
    /**
     * 使用组合方式
     */
    private FlyBehavior flyBehavior;

    private BarkingBehavior barkingBehavior;

    public void fly() {
        if (flyBehavior != null) {
            System.out.print(this.name + ":");
            flyBehavior.fly();
        }
    }


    public void barking() {

        if (barkingBehavior != null) {
            System.out.print(this.name + ":");
            barkingBehavior.barking();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String getName() {
        return name;
    }

    public void setBarkingBehavior(BarkingBehavior barkingBehavior) {
        this.barkingBehavior = barkingBehavior;
    }

    public void setName(String name) {
        this.name = name;
    }
}
