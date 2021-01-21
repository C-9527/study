package 迭代器模式.university;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : Department
 * @description : 系
 * @date : 2021/01/18 18:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    /**
     * 名字
     */
    private String name;

    /**
     * 描述
     */
    private String desc;
    
}
