import airport.Flyable;
import airport.Tower;
import transport.AirCraftFactory;
import singleton.WeatherProvider;

public class Simulation {
    public static void main(String[] args) {

//          Get the weatherProvide instance singleton
        WeatherProvider weatherProvider = WeatherProvider.getWeatherProvider();

//          This is the factory
        AirCraftFactory airCraftFactory = new AirCraftFactory();
        Flyable airCraft = airCraftFactory.newAirCraft("Ba1", "BALOON", 23, 66, 10);

        Tower tower = new Tower();

        tower.register(airCraft);


    }
}