package 原型模式.浅拷贝;

/**
 * @Author : 子非鱼
 * @ClassName：Sheep
 * @Description ：对于数据类型是基本数据类型或String的成员变量，浅拷贝会直接进行值传递，
 * 也就是将该属性值复制一份给新的对象。
 *  对于数据关型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等
 *  那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值(内存地址)复制一份给新的对象。
 *  因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，
 *  在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
 * @Date : 2020/05/04 22:31
 **/
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    private Sheep friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
