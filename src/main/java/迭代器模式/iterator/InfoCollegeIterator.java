package 迭代器模式.iterator;

import 迭代器模式.university.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author : Shadow
 * @className : InfoCollegeIterator
 * @description : 信息工程学院
 * @date : 2021/01/18 18:43
 **/
public class InfoCollegeIterator implements Iterator {

    private List<Department> departments;

    private int position = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.size();
    }

    @Override
    public Object next() {
        return departments.get(position++);
    }
}
