package 适配器模式.类适配器;

/**
 * @Author : 子非鱼
 * @ClassName：PowerAdapter
 * @Description ：手机适配器，220V-->5V,继承200v，实现5V
 * 继承是为了使用输出220V电压的方法，实现是为了转化电压，面向接口编程
 * @Date : 2020/05/06 22:03
 **/
public class PhoneAdapter extends Power220V implements Adapter {
    /**
     * 手机适配器，电压转化为5V
     * @return
     */
    @Override
    public Integer voltageConversion() {
        Integer src = outPower220V();
        //转化为5V
        Integer target = src / 44;
        return target;
    }
}
