package 责任链模式;

/**
 * @author : Shadow
 * @className : DepartmentApprover
 * @description :TODO
 * @date : 2021/01/21 18:33
 **/
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号id=" + request.getId() + "被" + this.getName() + "处理");
        } else {
            // 自己处理不了让上级处理
            Approver approver = getApprover();
            if (approver != null) {
                System.out.println(this.getName() + "无法处理，" + "请求递交给" + approver.getName());
                approver.processRequest(request);
            }
        }

    }
}
