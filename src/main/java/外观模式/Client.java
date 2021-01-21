package 外观模式;

/**
 * @Author : 子非鱼
 * @ClassName：Client
 * @Description ：外观模式客户端，使用一个类组合其他子系统
 *                客户端不需要和各个子系统进行交互，
 *                只要和外观类进行交互即可
 * @Date : 2020/05/10 22:31
 **/
public class Client {
    public static void main(String[] args) {
        //使用外观模式
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
