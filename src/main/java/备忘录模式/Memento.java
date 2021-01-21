package 备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : Memento
 * @description : 记录数据
 * @date : 2021/01/20 17:11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memento {

    /**
     * 攻击力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

}
