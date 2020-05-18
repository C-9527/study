package 工厂模式.简单工厂模式.order;

import 工厂模式.简单工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author : 子非鱼
 * @ClassName：OrderPizza
 * @Description ：订购披萨
 * @Date : 2020/05/02 21:18
 **/
public class OrderPizza {

    	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; // 订购披萨的类型
//		do {
//			orderType = getType();
//
//			//输出pizza 制作过程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//
//		} while (true);
	}


    SimplePizzaFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimplePizzaFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimplePizzaFactory simpleFactory) {
        String orderType; //用户输入的

        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if(pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while(true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
