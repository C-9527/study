package 观察者模式;

import 观察者模式.observer.Baidu;
import 观察者模式.observer.Sina;
import 观察者模式.subject.Weather;
import 观察者模式.subject.WeatherSubject;

/**
 * @author : Shadow
 * @className : Client
 * @description :TODO
 * @date : 2021/01/19 15:29
 **/
public class Client {
    public static void main(String[] args) {
        // 气象台，被观察者
        WeatherSubject weatherSubject = new WeatherSubject();
        // 注册观察者
        weatherSubject.registerObserver(new Baidu());
        weatherSubject.registerObserver(new Sina());

        // 天气改变
        weatherSubject.changeWeather(new Weather(20f, 30f, 40f));
    }
}
