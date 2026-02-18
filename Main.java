//03-02-26 Smart Fridge

interface Electronic {
    void consumePower();
}

interface SmartFeature {
    void connectToInternet();
}

class SmartFridge implements Electronic, SmartFeature {
    int coolingLevel = 3;

    public void consumePower() {
        System.out.println("Power consumed: " + (coolingLevel * 50) + " units");
    }

    public void connectToInternet() {
        System.out.println("Connected to Internet. IP: 192.168.1.10");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartFridge fridge = new SmartFridge();
        fridge.consumePower();
        fridge.connectToInternet();
    }
}
