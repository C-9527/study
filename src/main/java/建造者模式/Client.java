package 建造者模式;

/**
 * @Author : 子非鱼
 * @ClassName：Client
 * @Description ：建造者模式：将产品和建造过程解耦，即产品类自身不进行自我建造
 *              指挥者指挥建造者建造房子
 * @Date : 2020/05/05 22:24
 **/
public class Client {
    public static void main(String[] args) {
        //普通房子建造者
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //指挥者:包工头指挥建造者建造
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        //开始建造普通房子，返回房子
        House commonHouse = houseDirector.buildHouse();
        System.out.println(commonHouse);

        //高楼建造者
        System.out.println("************高楼建造者************");
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        houseDirector.setHouseBuilder(highHouseBuilder);
        House highHouse = houseDirector.buildHouse();
        System.out.println(highHouse);
    }
}
