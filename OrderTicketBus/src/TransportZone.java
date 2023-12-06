import java.util.ArrayList;
import java.util.List;

public class TransportZone {
    // транспортная зона
    private int id;
    private String zoneName;
    private List<BusStop>busStops;
    
    public TransportZone(int id, String zoneName) {
        this.id = id;
        this.zoneName = zoneName;
        this.busStops = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }

    public void addBusStop(BusStop busStop){
        busStops.add(busStop);
    }
}
