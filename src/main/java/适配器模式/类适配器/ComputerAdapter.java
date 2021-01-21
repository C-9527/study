package 适配器模式.类适配器;

/**
 * @Author : 子非鱼
 * @ClassName：ComputerAdapter
 * @Description ：电脑适配器20V
 * @Date : 2020/05/06 22:14
 **/
public class ComputerAdapter extends Power220V implements Adapter {
    @Override
    public Integer voltageConversion() {
        Integer src = outPower220V();
        //转化为20V
        Integer target = src / 11;
        return target;
    }
}
