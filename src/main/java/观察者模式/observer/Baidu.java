package 观察者模式.observer;

import 观察者模式.subject.Weather;

/**
 * @author : Shadow
 * @className : Baidu
 * @description :TODO
 * @date : 2021/01/19 15:02
 **/
public class Baidu implements Observer {

    @Override
    public void update(Weather weather) {
        System.out.println("百度为你播报当前天气为" + weather.displayWeather());
    }
}
