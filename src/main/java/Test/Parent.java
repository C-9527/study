package Test;

/**
 * @Author : 子非鱼
 * @ClassName：Parent
 * @Description ：TODO
 * @Date : 2020/05/02 22:52
 **/
public class Parent {
     Parent() {
        System.out.println("Parent构造器");

    }
    public void say() {
         System.out.println("父类方法");
    }

    public static void main(String[] args) {
        new Parent();
    }
}
