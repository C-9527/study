package 迭代器模式;

import 迭代器模式.university.College;
import 迭代器模式.university.ComputerCollege;
import 迭代器模式.university.InfoCollege;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/19 10:04
 **/
public class Client {

    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        colleges.add(new InfoCollege("信息工程学院"));
        colleges.add(new ComputerCollege("计算机学院", 10));
        OutPut outPut = new OutPut(colleges);
        outPut.printCollege();
    }
}
