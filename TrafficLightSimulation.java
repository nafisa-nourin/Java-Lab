/*Write a Java program to simulate a traffic light system 
using threads, priorities, and interruption (emergency mode). */

class TrafficLight implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("RED");
                Thread.sleep(2000);

                System.out.println("GREEN");
                Thread.sleep(2000);

                System.out.println("YELLOW");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Emergency Mode Activated!");

            while (true) {
                try {
                    System.out.println("BLINKING YELLOW...");
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        }
    }
}

public class TrafficLightSimulation{
    public static void main(String[] args) throws Exception {
        TrafficLight t = new TrafficLight();
        Thread thread = new Thread(t);

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Thread.sleep(7000);
        thread.interrupt();
    }
}