package 适配器模式.类适配器;

/**
 * @Author : 子非鱼
 * @ClassName：People
 * @Description ：人使用适配器给手机充电,、
 * @Date : 2020/05/06 22:18
 **/
public class People {
    public static void main(String[] args) {
        System.out.println("<<<<---**类适配器模式**--->>>>");
        Phone phone = new Phone();
        PhoneAdapter phoneAdapter = new PhoneAdapter();
//        使用手机适配器给手机充电
        phone.charging(phoneAdapter);
        System.out.println("**************************");
        //使用电脑适配器给手机充电
        ComputerAdapter computerAdapter = new ComputerAdapter();
        phone.charging(computerAdapter);

    }
}
