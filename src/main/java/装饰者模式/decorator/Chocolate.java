package 装饰者模式.decorator;

import 装饰者模式.drink.Drink;

/**
 * 具体的Decorator， 这里就是调味品
 * @author 25675
 */
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		// 调味品 的价格
		setPrice(3.0f);
	}

}

