import java.util.ArrayList;
import java.util.List;

public class BusRoute {
    // маршрут автобуса
    private int id;
    private String routeName;
    private int capacity;
    private List<BusStop> busStops;
    
    public BusRoute(int id, String routeName, int capacity) {
        this.id = id;
        this.routeName = routeName;
        this.capacity = capacity;
        this.busStops = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getRouteName() {
        return routeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }

    public void addBusStop(BusStop busStop){
        busStops.add(busStop);
    }

}
