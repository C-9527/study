package 装饰者模式.decorator;

import 装饰者模式.drink.Drink;

/**
 * @author 25675
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) { //组合
        // TODO Auto-generated constructor stub
        this.drink = drink;
    }

    @Override
    public float cost() {
        // TODO Auto-generated method stub
        // getPrice 自己价格+饮料的价格
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        // TODO Auto-generated method stub
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }



}

