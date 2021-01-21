package 适配器模式.类适配器;

/**
 * @Author : 子非鱼
 * @ClassName：Phone
 * @Description ：手机充电
 * @Date : 2020/05/06 22:06
 **/
public class Phone {

    public void charging(Adapter adapter) {
        if (adapter.voltageConversion() <= 5) {
            System.out.println("正在充电……");
        } else {
            System.err.println("电压过高!");
        }
    }
}
