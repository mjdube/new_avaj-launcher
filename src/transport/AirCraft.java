package transport;

public class AirCraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter = 0;

    public AirCraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public long nextId(){
        id += idCounter;
        return (id);
    }
}
