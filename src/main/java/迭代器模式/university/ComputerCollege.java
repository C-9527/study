package 迭代器模式.university;

import 迭代器模式.iterator.ComputerCollegeIterator;

import java.util.Iterator;

/**
 * @author : Shadow
 * @className : ComputerCollege
 * @description : 计算机学院
 * @date : 2021/01/19 09:29
 **/
public class ComputerCollege implements College {

    private String name;

    private Department[] departments;

    private int index = 0;

    private int capacity;

    public ComputerCollege(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
        departments = new Department[capacity];
        addDepartment(new Department("软件工程", "软件工程真不孬"));
        addDepartment(new Department("数媒", "数媒也不错"));
        addDepartment(new Department("电商", "电商是干什么的"));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addDepartment(Department department) {
        if (index >= capacity) {
            System.out.println("学院已满，无法添加");
            return;
        }
        departments[index++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments, index);
    }
}
