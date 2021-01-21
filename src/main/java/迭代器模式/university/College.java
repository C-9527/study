package 迭代器模式.university;

import java.util.Iterator;

/**
 * @author : Shadow
 * @className : College
 * @description : 学院
 * @date : 2021/01/19 09:22
 **/
public interface College {
    String getName();

    void addDepartment(Department department);

    Iterator createIterator();
}
