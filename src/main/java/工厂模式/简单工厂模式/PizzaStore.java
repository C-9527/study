package 工厂模式.简单工厂模式;

import 工厂模式.简单工厂模式.order.OrderPizza;
import 工厂模式.简单工厂模式.order.SimplePizzaFactory;

/**
 * @Author : 子非鱼
 * @ClassName：pizzaStore
 * @Description ：TODO
 * @Date : 2020/05/02 21:16
 **/
public class PizzaStore {
    public static void main(String[] args) {
        //订购
//        OrderPizza orderPizza = new OrderPizza();
        OrderPizza orderPizza = new OrderPizza(new SimplePizzaFactory());
    }



}
