package 原型模式.深拷贝;

import java.io.Serializable;

/**
 * @Author : 子非鱼
 * @ClassName：Dog
 * @Description ：TODO
 * @Date : 2020/05/05 09:30
 **/
public class Dog  implements Cloneable, Serializable {
    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
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
}
