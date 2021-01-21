package 装饰者模式.decorator;

import 装饰者模式.drink.Drink;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
