package 适配器模式.类适配器;

/**
 * @Author : 子非鱼
 * @ClassName：Power5V
 * @Description ：转化电压接口
 * @Date : 2020/05/06 22:02
 **/
public interface Adapter {
    /**
     * 电压转化
     * @return 返回转化后的电压
     */
    Integer voltageConversion();
}
