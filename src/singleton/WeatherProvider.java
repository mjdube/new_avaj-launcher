package singleton;

import transport.Coordinates;

import java.util.Random;

public class WeatherProvider {

    private static WeatherProvider weatherProvider;
    private String weather[] = {"SUN", "SNOW", "RAIN", "FOG"};

    Random random = new Random();

    private WeatherProvider(){
    }

    public static WeatherProvider getWeatherProvider(){
        if (weatherProvider == null){
            weatherProvider = new WeatherProvider();
        }
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        int change = random.nextInt(4);
        return weather[change];
    }
}
