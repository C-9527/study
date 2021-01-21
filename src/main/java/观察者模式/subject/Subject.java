package 观察者模式.subject;

import 观察者模式.observer.Observer;

/**
 * @author : Shadow
 * @className : Subject
 * @description : 主体，被观察者
 * @date : 2021/01/19 14:48
 **/
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver(Weather weather);
}
