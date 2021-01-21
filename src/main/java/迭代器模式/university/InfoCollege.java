package 迭代器模式.university;

import 迭代器模式.iterator.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Shadow
 * @className : InfoCollege
 * @description : 信息学院
 * @date : 2021/01/19 09:29
 **/
public class InfoCollege implements College {

    private String name;

    private List<Department> departments;

    public InfoCollege(String name) {
        this.name = name;
        departments = new ArrayList<>();
        addDepartment(new Department("通信工程", "这个专业很好"));
        addDepartment(new Department("信息安全", "这个专业也很好"));
        addDepartment(new Department("网络安全", "这个专业很不错"));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
