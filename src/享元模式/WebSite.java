package 享元模式;

/**
 * @Author : 子非鱼
 * @ClassName：WebSite
 * @Description ：内部状态，不变的内容，网站的类型是固定的，使用者是变化的
 * @Date : 2020/05/11 22:26
 **/
public abstract class WebSite {

    public abstract void use(User user);//抽象方法
}
