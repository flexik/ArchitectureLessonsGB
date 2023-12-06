import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketPurchase {

    private List<Ticket> tickets;

    public TicketPurchase() {
        this.tickets = new ArrayList<>();
    }

    // метод создает новый билет и добавляет его в список
    public Ticket purchaseTicket(int ticketNumber, Person passenger, BusRoute busRoute, BigDecimal price, LocalDateTime dateTime,
    boolean isLuggage){
        Ticket ticket = new Ticket(ticketNumber, passenger, busRoute, price, dateTime, isLuggage);
        tickets.add(ticket);
        return ticket;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
