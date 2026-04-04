
class TicketCounter {
    int availableSeats = 50;

    void bookTicket(String name, int seats) {
        System.out.println("Welcome " + name);

        try {
            Thread.sleep(500); // non-critical
        } catch (Exception e) {}

        synchronized (this) {  // critical section only
            if (availableSeats >= seats) {
                System.out.println(name + " booking " + seats + " seats");
                availableSeats -= seats;
                System.out.println("Seats left: " + availableSeats);
            } else {
                System.out.println("Not enough seats for " + name);
            }
        }
    }
}

class User extends Thread {
    TicketCounter tc;
    String name;
    int seats;

    User(TicketCounter tc, String name, int seats) {
        this.tc = tc;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        tc.bookTicket(name, seats);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketCounter tc = new TicketCounter();

        new User(tc, "A", 20).start();
        new User(tc, "B", 40).start();
    }
}
