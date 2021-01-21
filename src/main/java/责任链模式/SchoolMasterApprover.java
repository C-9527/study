package 责任链模式;

/**
 * @author : Shadow
 * @className : ScahoolMasterApprover
 * @description :TODO
 * @date : 2021/01/21 18:47
 **/
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 20000) {
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
