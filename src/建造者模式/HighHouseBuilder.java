package 建造者模式;

/**
 * @Author : 子非鱼
 * @ClassName：HighBuilding
 * @Description ：高楼建造者
 * @Date : 2020/05/05 22:13
 **/
public class HighHouseBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的打地基100米 ");
        house.setBaise(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的砌墙20cm ");
        house.setWall(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的透明屋顶 ");
        house.setRoofed(" 高楼的透明屋顶 ");
    }

}
