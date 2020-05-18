package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 子非鱼
 * @ClassName：College
 * @Description ：TODO
 * @Date : 2020/05/09 21:52
 **/
public class College extends OrganizationComponent {

    /**
     *  List 中 存放的Department
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        //  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.remove(organizationComponent);
    }

    /**
     *   print方法，就是输出University 包含的学院
     */
    @Override
    protected void print() {
        // TODO Auto-generated method stub
        System.out.println("--" + getName());
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}