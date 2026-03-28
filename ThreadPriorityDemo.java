/* Write a Java program to demonstrate thread priorities 
using multiple threads and compare their execution.*/

class CounterThread extends Thread {
    long count = 0;
    boolean running = true;

    public void run() {
        while (running) {
            count++;
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) throws Exception {
        CounterThread low = new CounterThread();
        CounterThread normal = new CounterThread();
        CounterThread high = new CounterThread();

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();

        Thread.sleep(3000);

        low.running = false;
        normal.running = false;
        high.running = false;

        System.out.println("Low Priority: " + low.count);
        System.out.println("Normal Priority: " + normal.count);
        System.out.println("High Priority: " + high.count);
    }
}