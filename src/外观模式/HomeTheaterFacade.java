package 外观模式;

import 外观模式.device.*;

/**
 * @Author : 子非鱼
 * @ClassName：HomeTheaterFacade
 * @Description 外观模式
 * @Date : 2020/05/10 22:29
 **/
public class HomeTheaterFacade {

    /**
     * 定义各个子系统对象
     */
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    public HomeTheaterFacade() {
        super();
        //组合子系统
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dVDPlayer = DVDPlayer.getInstanc();
    }

    /**
     * 操作分成 4 步
     */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dVDPlayer.play();
    }

    public void pause() {
        dVDPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dVDPlayer.off();
    }


}