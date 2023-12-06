public class BusStop {
    // автобусная остановка
    private int id;
    private String stopName;
    private double longitude;
    private double latitude;
    
    public BusStop(int id, String stopName, double longitude, double latitude) {
        this.id = id;
        this.stopName = stopName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public String getStopName() {
        return stopName;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    
}
