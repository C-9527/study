package Test;

/**
 * @Author : 子非鱼
 * @ClassName：Test1
 * @Description ：
 * 1.类中所有属性的默认值（一举而成）
 *
 * 2. 父类静态属性初始化，静态块，静态方法的声明（按出现顺序执行）
 *
 * 3. 子类静态属性初始化，静态块，静态方法的声明 （按出现顺序执行）
 *
 * 4. 调用父类的构造方法，
 * 首先父类的非静态成员初始化，构造块，普通方法的声明（按出现顺序执行）
 * 然后父类构造方法
 *
 * 5. 调用子类的构造方法，
 * 首先子类的非静态成员初始化，构造块，普通方法的声明（按出现顺序执行）
 * 然后子类构造方法。
 * @Date : 2020/05/03 09:04
 **/
public class Test1 {
    //因为静态部分是依赖于类，而不是依赖于对象存在的，所以静态部分的加载优先于对象存在。
    //先加载整个类，初始化静态代码，再实例化对象
    static {
        System.out.println("yes");
    }
    public static String name = get();

    public Test1() {
    }

    public static String get() {
        System.out.println("Test start");
        return "test name";
    }

    public static void main(String[] args) {
        /**
         * 类加载过程，不涉及构造方法  　　　　
         * 实例化过程，涉及构造方法
         */

        /**
         * 1、首先jvm找到main入口，加载整个类
         * 2、找到整个类所有的静态部分，包括静态变量和静态代码块，静态方法 ，
         * 这里是先找到name，发现它调用了get()方法，就先执行get方法，
         * 打印 test start ,返回值给name,执行完成之后，发现没有其他的
         * 静态变量或代码块啦，就执行main方法，打印main start
         */
        System.out.println("main start");
        Test1 bb = new Test1();
    }
}
