package Test;

/**
 * @Author : 子非鱼
 * @ClassName：Child
 * @Description ：TODO
 * @Date : 2020/05/02 22:52
 **/
public class Child extends Parent {
    Child() {
        System.out.println("Child构造器");
    }

    /**
     * 父类方法被重写，运行子类，最终调用子类方法
     */
    @Override
    public void say() {
        System.out.println("子类方法");
    }

    public static void main(String[] args) {
        //首先调用父类构造方法
        new Child().say();
        new Parent().say();
    }

}
