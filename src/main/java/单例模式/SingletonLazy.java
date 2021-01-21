package 单例模式;

/**
 * @Author : 子非鱼
 * @ClassName：SingletonLazy
 * @Description ：懒加载，当使用该对象时才加载，线程安全
 * @Date : 2020/05/01 21:57
 **/
public class SingletonLazy {
    //构造器私有化
    private SingletonLazy(){ }
    //被volatile修饰的变量能够保证每个线程能够获取该变量的最新值，从而避免出现数据脏读的现象。
    private static volatile SingletonLazy instance;
    //静态代码块
    /*static {
        instance = new Singleton();
    }*/

    /**
     *  在方法上加锁，因为每次调用该方法都会排队等候，消耗较大
     */
    public static synchronized SingletonLazy getInstanceBad() {
        if (instance == null) {
            return instance = new SingletonLazy();
        }
        return instance;
    }


    /**
     * 在代码块上加锁，
     * 可以正常进入方法内，当instance == null时才进入同步代码块，
     * 所以同步代码块执行的次数并不多，这样效率更高
     * @return
     */
    public static SingletonLazy getInstanceGood() {

        if (instance == null) {
            //如果两个线程同时进入，则进行第二次判断
            synchronized(SingletonLazy.class) {
                if (instance == null) {
                    return instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
