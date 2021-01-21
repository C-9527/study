package 工厂模式.抽象工厂模式;

import 工厂模式.抽象工厂模式.factory.BJFactory;
import 工厂模式.抽象工厂模式.factory.LDFactory;
import 工厂模式.抽象工厂模式.order.OrderPizza;

/**
 * @Author : 子非鱼
 * @ClassName：PizzaStore
 * @Description ：TODO
 * @Date : 2020/05/03 22:42
 **/
public class PizzaStore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
        new OrderPizza(new BJFactory());
    }

}
