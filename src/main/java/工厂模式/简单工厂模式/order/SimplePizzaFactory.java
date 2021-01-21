package 工厂模式.简单工厂模式.order;

import 工厂模式.简单工厂模式.pizza.CheesePizza;
import 工厂模式.简单工厂模式.pizza.GreekPizza;
import 工厂模式.简单工厂模式.pizza.PepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

/**
 * @Author : 子非鱼
 * @ClassName：SimplePizzaFactory
 * @Description ：简单工厂模式
 * @Date : 2020/05/02 21:34
 **/
public class SimplePizzaFactory {

    Pizza pizza = null;
    public Pizza createPizza(String orderType) {
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


}
