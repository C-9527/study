package 原型模式.深拷贝;

import java.io.*;

/**
 * @Author : 子非鱼
 * @ClassName：Sheep
 * @Description ：
 * 1)复制对象的所有基本数据类型的成员变量值
 * 2)为所有 引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象
 * 可达的所有对象。也就是说，对象进行深拷贝要对整个对象(包括对象的引用类型)进行拷贝
 * 3)深拷贝实现方式1:重写clone方法来实现深拷贝
 * 4)深拷贝实现方式2:通过对象序列化实现深拷贝(推荐)
 * @Date : 2020/05/04 22:31
 **/
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String color;
    private Dog friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        //克隆自己
        Sheep sheep = (Sheep) super.clone();
        //克隆盆友
        sheep.friend = friend.clone();
        //返回克隆对象
        return sheep;
    }

    /**
     *  深拷贝 - 方式2 通过对象的序列化实现 (推荐)
     */
    public Sheep deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep copyObj = (Sheep) ois.readObject();
            return copyObj;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }

    }

    public Dog getFriend() {
        return friend;
    }

    public void setFriend(Dog friend) {
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
