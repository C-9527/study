package 原型模式.深拷贝;

/**
 * @Author : 子非鱼
 * @ClassName：CloneTest
 * @Description ：深拷贝测试
 * @Date : 2020/05/04 22:46
 **/
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", 1, "白色");
        Dog dog = new Dog("牧羊犬", 5);
        sheep.setFriend(dog);
//        深拷贝实现方式1:重写clone方法来实现深拷贝
        Sheep sheepClone = sheep.clone();
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheepClone.getFriend().hashCode());
        System.out.println("_________________________");
//        深拷贝实现方式2:通过对象序列化实现深拷贝(推荐)
        Sheep copySheep = sheep.deepClone();
        System.out.println("sheep.hashCode");
        System.out.println(sheep.hashCode());
        System.out.println(copySheep.hashCode());
        System.out.println("sheep.friend.hashCode");
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(copySheep.getFriend().hashCode());


    }


}
