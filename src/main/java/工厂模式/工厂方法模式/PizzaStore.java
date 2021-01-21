package 工厂模式.工厂方法模式;

import 工厂模式.工厂方法模式.order.BJOrderPizza;
import 工厂模式.工厂方法模式.order.LDOrderPizza;

/**
 * @Author : 子非鱼
 * @ClassName：PizzaStore
 * @Description ：TODO
 * @Date : 2020/05/02 22:40
 **/
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
        // TODO Auto-generated method stub
    }

}