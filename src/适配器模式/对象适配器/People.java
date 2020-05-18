package 适配器模式.对象适配器;

/**
 * @Author : 子非鱼
 * @ClassName：People
 * @Description ：人使用适配器给手机充电,、
 * @Date : 2020/05/06 22:18
 **/
public class People {
    public static void main(String[] args) {
        System.out.println("<<<<---**对象适配器模式**--->>>>");
        //220V电压
        Power220V power220V = new Power220V();
        //适配220V电压
        PhoneAdapter phoneAdapter = new PhoneAdapter(power220V);
        Phone phone = new Phone();
        //使用适配器充电
        phone.charging(phoneAdapter);

    }
}
