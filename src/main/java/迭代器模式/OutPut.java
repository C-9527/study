package 迭代器模式;

import 迭代器模式.university.College;

import java.util.Iterator;
import java.util.List;

/**
 * @author : Shadow
 * @className : OutPut
 * @description :TODO
 * @date : 2021/01/19 09:57
 **/
public class OutPut {

    private List<College> colleges;

    public OutPut(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege() {
        for (College college : colleges) {
            System.out.println("=====" + college.getName() + "=====");
            printDepartment(college.createIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
