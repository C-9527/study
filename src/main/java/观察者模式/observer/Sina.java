package 观察者模式.observer;

import 观察者模式.subject.Weather;

/**
 * @author : Shadow
 * @className : Sina
 * @description :TODO
 * @date : 2021/01/19 15:31
 **/
public class Sina implements Observer {
    @Override
    public void update(Weather weather) {
        System.out.println("新浪为你播报当前天气为" + weather.displayWeather());
    }
}
