package airport;

import singleton.WeatherProvider;

import java.util.ArrayList;
import java.util.List;

public class Tower implements Flyable{
    private List<Flyable> observers = new ArrayList<>();

//    WeatherProvider weatherProvider = WeatherProvider.getWeatherProvider();

    public void register(Flyable flyable){
        observers.add(flyable);
    }

    public void unregister(Flyable flyable){
        observers.remove(flyable);
    }

    protected void conditionsChanged(){

    }

    @Override
    public void updateConditions() {
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
