package 适配器模式.接口适配器;

/**
 * @Author : 子非鱼
 * @ClassName：Client
 * @Description ：TODO
 * @Date : 2020/05/07 10:49
 **/
public class Client {
    public static void main(String[] args) {
        //匿名内部类，选择性重写父类方法
        AbstractClass abstractClass = new AbstractClass(){
            @Override
            public void operator3() {
               System.out.println("operator3方法被重写");
            }
        };
        abstractClass.operator1();
        abstractClass.operator3();
    }
}
