package 建造者模式;

/**
 * @Author : 子非鱼
 * @ClassName：HouseBuilder
 * @Description ：TODO
 * @Date : 2020/05/05 22:11
 **/
// 抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }

}
