package Test;

/**
 * @Author : 子非鱼
 * @ClassName：TestExtends
 * @Description ：创建一个对象时首先调用的是构造方法中的第一句super()
 *                可能根据情况不同有不同的参数,然后进行构造方法外的成员变量默认赋值,
 *                最后执行构造方法中其余语句.
 * @Date : 2020/05/03 08:47
 **/
class Supper {

   private int i = 10;

    public Supper() {
        super();
        //调用者为子类对象，因为子类重写了父类的方法，
        //所以print()会调用子类重写的方法，这时父类的构造方法并没有执行完毕
        //子类的属性值只是初始化了，被没有赋值
        print();
        i = 20;
    }

    public void print() {
        System.out.println("Supper===" + i);
    }
}

class Sub extends Supper {

    //加载类时为类中属性初始化，如 int i = 0, String s = null
    //在调用构造方法中的第一句super()之后，才为类中变量进行赋值
    private int i = 30;
    public Sub() {
        //每个子类构造方法中都隐藏一个super()方法，这里显示写出,即构造子类对象时，先调用父类构造方法
        //创建一个对象时首先调用的是构造方法中的第一句super(),即父类构造方法，
        // super()执行之后，为类中属性赋值
        super();
        print();
        super.print();
        i = 40;
    }

    @Override
    public void print() {
        System.out.println("Sub===" + i);
    }
}

public class TestExtends {

    public static void main(String[] args) {
        new Sub();
    }
}
