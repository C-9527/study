package 适配器模式.对象适配器;

/**
 * @Author : 子非鱼
 * @ClassName：PowerAdapter
 * @Description ：手机适配器，220V-->5V,不使用继承，使用依赖、聚合、组合
 * @Date : 2020/05/06 22:03
 **/
public class PhoneAdapter implements Adapter {

    Power220V power220V;

    PhoneAdapter(Power220V power220V) {
        this.power220V = power220V;
    }
    /**
     * 手机适配器，电压转化为5V
     * @return
     */
    @Override
    public Integer voltageConversion() {

        if (this.power220V != null) {
            Integer src = this.power220V.outPower220V();
            //转化为5V
            Integer target = src / 44;
            return target;
        }
        return this.power220V.outPower220V();

    }
}
