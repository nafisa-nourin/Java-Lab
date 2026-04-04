
import java.util.*;

class Bakery {
    ArrayList<String> tray = new ArrayList<>();
    int MAX = 5;

    synchronized void bakeBread() {
        try {
            while (tray.size() == MAX)
                wait();

            tray.add("Loaf");
            System.out.println("Baked bread. Tray size: " + tray.size());

            notifyAll();
        } catch (Exception e) {}
    }

    synchronized void buyBread() {
        try {
            while (tray.size() == 0)
                wait();

            tray.remove(0);
            System.out.println("Bought bread. Remaining: " + tray.size());

            notifyAll();
        } catch (Exception e) {}
    }
}

class Baker extends Thread {
    Bakery b;

    Baker(Bakery b) {
        this.b = b;
    }

    public void run() {
        while (true)
            b.bakeBread();
    }
}

class Customer extends Thread {
    Bakery b;

    Customer(Bakery b) {
        this.b = b;
    }

    public void run() {
        while (true)
            b.buyBread();
    }
}

public class BakeryFactory {
    public static void main(String[] args) {
        Bakery b = new Bakery();

        new Baker(b).start();
        new Customer(b).start();
    }
}