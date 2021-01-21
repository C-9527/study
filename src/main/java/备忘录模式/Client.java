package 备忘录模式;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/20 17:33
 **/
public class Client {
    public static void main(String[] args) {
        // 开局一个道士一条狗
        System.out.println("------" + "开局一个道士一条狗" + "------");
        GameRole gameRole = new GameRole(100, 100);
        gameRole.display();

        // 保存当前角色信息
        Caretaker caretaker = new Caretaker(gameRole.createMemento());

        // 开始打怪升级
        System.out.println("------" + "开始打怪升级" + "------");
        gameRole.setVit(gameRole.getVit() + 1000);
        gameRole.setDef(gameRole.getDef() + 500);
        gameRole.display();

        // 遇到大Boss，一下回到解放前
        System.out.println("------" + "遇到大Boss，回到解放前" + "------");
        gameRole.recover(caretaker.getMemento());
        gameRole.display();
    }
}
