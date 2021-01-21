package 责任链模式;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/21 18:51
 **/
public class Client {

    public static void main(String[] args) {
        SchoolMasterApprover masterApprover = new SchoolMasterApprover("校长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(masterApprover);

        departmentApprover.processRequest(new PurchaseRequest(1001, 1111, 25000f));
    }
}
