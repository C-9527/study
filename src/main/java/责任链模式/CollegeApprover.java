package 责任链模式;

/**
 * @author : Shadow
 * @className : CollegeApprover
 * @description :TODO
 * @date : 2021/01/21 18:43
 **/
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
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
