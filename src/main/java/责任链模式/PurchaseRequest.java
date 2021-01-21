package 责任链模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : PurchaseRequest
 * @description :TODO
 * @date : 2021/01/21 18:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {
    /**
     * 请求类型
     */
    private Integer type;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 金额
     */
    private Float price;

}
