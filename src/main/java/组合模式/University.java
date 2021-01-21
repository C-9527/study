package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 子非鱼
 * @ClassName：University
 * @Description ：University 就是 Composite , 可以管理College
 * @Date : 2020/05/09 21:51
 **/
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.add(organizationComponent);
    }


    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        // TODO Auto-generated method stub
        System.out.println(getName());
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}
