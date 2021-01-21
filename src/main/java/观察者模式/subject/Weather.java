package 观察者模式.subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : Weather
 * @description : 天气信息
 * @date : 2021/01/19 15:09
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    /**
     * 温度
     */
    private Float temperature;
    
    /**
     * 气压
     */
    private Float pressure;

    /**
     * 湿度
     */
    private Float humidity;

    /**
     * 更新天气
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    public void updateWeather(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        displayWeather();
    }

    /**
     * 显示天气信息
     */
    public String displayWeather() {
        return "天气状况{" +
                "气温=" + temperature +
                ", 气压=" + pressure +
                ", 湿度=" + humidity +
                '}';
    }
}
