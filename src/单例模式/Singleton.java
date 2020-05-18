package 单例模式;

/**
 * @Author : 子非鱼
 * @ClassName：Singleton
 * @Description ：单例模式
 * @Date : 2020/05/01 21:42
 **/
public class Singleton {
    private String name;
    /**
     * 在类装载的时候就完成了实例化，没有实现懒加载的效果，
     * 可能造成内存浪费
     */
    //构造器私有化
    private Singleton(){ }
    private static final Singleton instance = new Singleton();
    //静态代码块
    /*static {
        instance = new Singleton();
    }*/

    public static Singleton getInstance() {
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
