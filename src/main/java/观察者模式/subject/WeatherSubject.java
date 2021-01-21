package 观察者模式.subject;

import 观察者模式.observer.Observer;
import 观察者模式.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shadow
 * @className : WeatherData
 * @description :TODO
 * @date : 2021/01/19 14:54
 **/
public class WeatherSubject implements Subject {
    
    private List<Observer> observers;

    private Weather weather;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    /**
     * 改变天气
     * @param weather
     */
    public void changeWeather(Weather weather) {
        this.weather = weather;
        notifyObserver(weather);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Weather weather) {
        observers.forEach(observer -> observer.update(weather));
    }
}
