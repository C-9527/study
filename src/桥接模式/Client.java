package 桥接模式;

/**
 * @Author : 子非鱼
 * @ClassName：Client
 * @Description ：桥接模式，使用聚合代替继承，
 *               继承3*3，聚合3+3
 *               适用每一个类别中还有其他种类的场景
 * @Date : 2020/05/07 22:18
 **/
public class Client {
    public static void main(String[] args) {
        //折叠样式的Vivo手机
        FoldedPhone foldedPhone = new FoldedPhone(new Vivo());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("_____________________________");
        //直立样式小米手机
        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }
}
