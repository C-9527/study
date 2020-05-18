package 装饰者模式;

import 装饰者模式.decorator.Chocolate;
import 装饰者模式.decorator.Milk;
import 装饰者模式.drink.Drink;
import 装饰者模式.drink.LongBlack;

/**
 * @Author : 子非鱼
 * @ClassName：CoffeeBar
 * @Description ：咖啡店，装饰者模式，装饰者和被装饰者继承同一个父类，另外父类又组合到装饰者类中
 * @Date : 2020/05/08 22:21
 **/
public class CoffeeBar {
    public static void main(String[] args) {
        //一份美式咖啡
        Drink drink = new LongBlack();
//        System.out.println(drink.cost());
        //加入牛奶
        drink = new Milk(drink);
//        System.out.println(drink.cost());
//        System.out.println(drink.getDes());
        //加入一份巧克力
        drink = new Chocolate(drink);
        System.out.println(drink.getDes());
        //巧克力的价格+加了牛奶的咖啡的价格(牛奶的价格+美式咖啡的价格)
        System.out.println(drink.cost());
        //再加一份牛奶
        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

    }
}
