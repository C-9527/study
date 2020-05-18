package 适配器模式.对象适配器;

/**
 * @Author : 子非鱼
 * @ClassName：Power220V
 * @Description ：电压220V，被适配者
 * @Date : 2020/05/06 22:01
 **/
public class Power220V {
    public Integer outPower220V() {
//        System.out.println("220V电压");
        return 220;
    }
}
