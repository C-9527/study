package Test;

/**
 * @Author : 子非鱼
 * @ClassName：PrivateTest
 * @Description ：在一个子类被创建的时候，首先会在内存中创建一个父类对象，
 * 然后在父类对象外部放上子类独有的属性，两者合起来形成一个子类的对象。
 * 所以所谓的继承使子类拥有父类所有的属性和方法其实可以这样理解，
 * 子类对象确实拥有父类对象中所有的属性和方法，但是父类对象中的私有属性和方法，
 * 子类是无法访问到的，只是拥有，但不能使用。就像有些东西你可能拥有，但是你并不能使用。
 * 所以子类对象是绝对大于父类对象的，所谓的子类对象只能继承父类非私有的属性及方法的说法是错误的。
 * 可以继承，只是无法访问到而已。
 * @Date : 2020/05/08 09:38
 **/
class Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Apple extends Fruit {

}

public class PrivateTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("西瓜");
        Apple apple = new Apple();
        apple.setName("香蕉");
        System.out.println(apple.getName());
    }
}
