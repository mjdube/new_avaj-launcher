package transport;

import airport.Flyable;

public class AirCraftFactory {
    public Flyable newAirCraft(String name, String type, int longitude, int latitude, int height){
        Coordinates coordinates = new Coordinates(longitude,latitude,height);
        
        if (type.contains("BALOON"))
        {
            return new Baloon(name, coordinates);
        }
        else if (type.contains("HELICOPTER"))
        {
            return new Helicopter(name, coordinates);
        }
        else if (type.contains("JETPLANE"))
        {
            return new JetPlane(name, coordinates);
        }
        
        return null;
    }
}
