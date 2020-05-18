package 建造者模式;

/**
 * @Author : 子非鱼
 * @ClassName：CommonHouse
 * @Description ：普通房子建造者
 * @Date : 2020/05/05 22:12
 **/
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子打地基5米 ");
        house.setBaise("普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙10cm ");
        house.setWall("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
        house.setRoofed(" 普通房子屋顶 ");
    }

}
