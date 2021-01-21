package 迭代器模式.iterator;

import 迭代器模式.university.Department;

import java.util.Iterator;

/**
 * @author : Shadow
 * @className : ComputerCollegeIterator
 * @description : 计算机学院
 * @date : 2021/01/18 18:32
 **/
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;

    private int position = 0;

    /**
     * 数组中实际存储的数据容量
     */
    private int length;

    public ComputerCollegeIterator(Department[] departments, int length) {
        this.departments = departments;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() {
        return departments[position++];
    }
}
