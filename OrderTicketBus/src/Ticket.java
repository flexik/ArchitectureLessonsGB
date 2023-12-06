import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
    // билет на автобус
    private int ticketNumber;
    private Person passenger;
    private BusRoute busRoute;
    private BigDecimal price;
    private LocalDateTime dateTime;
    private boolean isLuggage;

    public Ticket(int ticketNumber, Person passenger, BusRoute busRoute, BigDecimal price, LocalDateTime dateTime,
            boolean isLuggage) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.busRoute = busRoute;
        this.price = price;
        this.dateTime = dateTime;
        this.isLuggage = isLuggage;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Person getPassenger() {
        return passenger;
    }

    public BusRoute getBusRoute() {
        return busRoute;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public boolean isLuggage() {
        return isLuggage;
    }


}
