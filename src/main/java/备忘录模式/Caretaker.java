package 备忘录模式;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author : Shadow
 * @className : Caretaker
 * @description : 保存数据状态
 * @date : 2021/01/20 17:13
 **/
@Data
public class Caretaker {

    /**
     * 只保存游戏角色的一次状态
     */
    private Memento memento;

    /**
     * 保存游戏角色的多次状态
     */
    private List<Memento> mementos;

    /**
     * 保存多个游戏角色的多个状态
     */
    private Map<String, List<Memento>> map;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }
}
