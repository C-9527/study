package 适配器模式.接口适配器;

/**
 * @Author : 子非鱼
 * @ClassName：AbstractClass
 * @Description ：抽象类默认实现了接口的方法，则其子类就可以选择性覆盖某一个方法，
 *              不必全部实现
 * @Date : 2020/05/07 10:47
 **/
public abstract class AbstractClass implements MyInterface{
    @Override
    public void operator1() {
        System.out.println("operator1");
    }

    @Override
    public void operator2() {
        System.out.println("operator2");
    }

    @Override
    public void operator3() {
        System.out.println("operator3");
    }

    @Override
    public void operator4() {
        System.out.println("operator4");
    }
}
