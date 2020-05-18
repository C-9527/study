package 工厂模式.抽象工厂模式.factory;

import 工厂模式.抽象工厂模式.pizza.LDCheesePizza;
import 工厂模式.抽象工厂模式.pizza.LDPepperPizza;
import 工厂模式.抽象工厂模式.pizza.Pizza;

/**
 * @Author : 子非鱼
 * @ClassName：LDFactory
 * @Description ：TODO
 * @Date : 2020/05/03 22:39
 **/
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}

