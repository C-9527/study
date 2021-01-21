package 模板方法模式;

/**
 * @Author : 子非鱼
 * @ClassName：Client
 * @Description ：模板方法模式
 * @Date : 2020/05/16 22:00
 **/
public class Client {

    public static void main(String[] args) {

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }

}
