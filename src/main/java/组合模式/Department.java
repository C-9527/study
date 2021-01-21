package 组合模式;

/**
 * @Author : 子非鱼
 * @ClassName：Department
 * @Description ：TODO
 * @Date : 2020/05/09 21:51
 **/
public class Department extends OrganizationComponent {

    //没有集合
    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点
    @Override
    protected void print() {
        System.out.println("----" + getName());
    }

}
