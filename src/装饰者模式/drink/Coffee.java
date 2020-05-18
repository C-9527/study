package 装饰者模式.drink;

/**
 * 咖啡类、也可以是奶茶类等
 * @author 25675
 */
public class Coffee extends Drink {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return getPrice();
	}

	
}
