package Test;

/**
 * @Author : 子非鱼
 * @ClassName：Test2
 * @Description ：TODO
 * @Date : 2020/05/03 11:18
 **/
public class Test2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static void chageName(Test2 test) {
        test.setName("小明");
    }


    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setName("小花");
        System.out.println(test2.getName());
        chageName(test2);
        System.out.println(test2.getName());
    }
}
