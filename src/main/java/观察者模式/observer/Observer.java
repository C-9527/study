package 观察者模式.observer;

import 观察者模式.subject.Weather;

/**
 * @author : Shadow
 * @className : Observer
 * @description : 观察者接口
 * @date : 2021/01/19 14:49
 **/
public interface Observer {

    /**
     * 观察者更新方法
     */
    void update(Weather weather);
}
