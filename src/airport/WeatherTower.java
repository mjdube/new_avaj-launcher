package airport;

import singleton.WeatherProvider;
import transport.Coordinates;

public class WeatherTower extends Tower {

    WeatherProvider weatherProvider = WeatherProvider.getWeatherProvider();

    public String getWeather(Coordinates coordinates){
        return "";
    }

    void changeWeather() {
        weatherProvider.getCurrentWeather()
    }


}
