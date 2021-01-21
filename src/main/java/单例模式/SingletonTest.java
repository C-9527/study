package 单例模式;

/**
 * @Author : 子非鱼
 * @ClassName：SingletonTest
 * @Description ：单例模式测试类
 * @Date : 2020/05/01 21:44
 **/
public class SingletonTest {
    public static void main(String[] args) {

        Singleton.getInstance().setName("2224");
        System.out.println(Singleton.getInstance().getName());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(SingletonLazy.getInstanceGood() == SingletonLazy.getInstanceGood());
    }
}
