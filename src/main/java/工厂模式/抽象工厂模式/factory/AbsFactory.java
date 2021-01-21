package 工厂模式.抽象工厂模式.factory;

import 工厂模式.抽象工厂模式.pizza.Pizza;

/**
 * @Author : 子非鱼
 * @ClassName：AbsFactory
 * @Description ：TODO
 * @Date : 2020/05/03 22:37
 **/
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    Pizza createPizza(String orderType);
}
