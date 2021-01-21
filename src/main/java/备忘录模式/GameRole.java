package 备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : GameRole
 * @description : 游戏角色
 * @date : 2021/01/20 17:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameRole {

    /**
     * 战斗力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

    /**
     * 根据当前状态记录Memento
     */
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    /**
     * 通过备忘录恢复数据
     */
    public void recover(Memento memento) {
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    public void display() {
        System.out.println("游戏角色当前属性：{" +
                "攻击力=" + vit +
                ", 防御力=" + def +
                '}');
    }
}
