package 原型模式.浅拷贝;

/**
 * @Author : 子非鱼
 * @ClassName：CloneTest
 * @Description ：浅拷贝测试
 * @Date : 2020/05/04 22:46
 **/
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", 1, "白色");
        Sheep friend = new Sheep("喜洋洋", 2, "白色");
        sheep.setFriend(friend);
        Sheep sheepClone = sheep.clone();
        System.out.println(sheep.hashCode());
        System.out.println(sheepClone.hashCode());
        System.out.println(sheep==sheepClone);
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheepClone.getFriend().hashCode());
        System.out.println(sheepClone.getFriend() == sheep.getFriend());
        sheepClone.getFriend().setName("懒洋洋");
        System.out.println(sheepClone.getFriend().getName());
    }


}
