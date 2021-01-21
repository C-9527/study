package 责任链模式;

/**
 * @author : Shadow
 * @className : Approver
 * @description :处理批准人
 * @date : 2021/01/21 18:26
 **/
public abstract class Approver {
    private Approver approver;

    private String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 处理请求的抽象方法
     * @param request 具体请求
     */
    public abstract void processRequest(PurchaseRequest request);

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    public String getName() {
        return name;
    }
}
