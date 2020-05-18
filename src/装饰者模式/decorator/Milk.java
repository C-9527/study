package 装饰者模式.decorator;

import 装饰者模式.drink.Drink;

/**
 * 牛奶
 * @author 25675
 */
public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" 牛奶 ");
		setPrice(2.0f); 
	}

}
