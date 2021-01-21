package 建造者模式;

/**
 * @Author : 子非鱼
 * @ClassName：House
 * @Description ：产品->Product
 * @Date : 2020/05/05 22:11
 **/

public class House {
    private String baise;
    private String wall;
    private String roofed;
    public String getBaise() {
        return baise;
    }
    public void setBaise(String baise) {
        this.baise = baise;
    }
    public String getWall() {
        return wall;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public String getRoofed() {
        return roofed;
    }
    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "baise='" + baise + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
