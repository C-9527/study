package Test;

/**
 * @Author : 子非鱼
 * @ClassName：StringTest
 * @Description ：TODO
 * @Date : 2020/05/11 21:51
 **/
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s4 = "hello";
        System.out.println(s == s4);
        s = s + "2141";
        String s1 = new String("hello");
        String s3 = new String("hello");
        System.out.println("s1 == s3?" + s1 == s3);
//        System.out.println(s1.hashCode());
//        System.out.println(s3.hashCode());
//        s1 = s1 + "2141";
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//        System.out.println(s == s1);

    }
}
