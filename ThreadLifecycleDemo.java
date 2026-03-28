/* Write a Java program to create a thread using 
Runnable and observe its different states (NEW, TIMED_WAITING, TERMINATED).
*/
class TaskRunner implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws Exception {
        TaskRunner task = new TaskRunner();
        Thread t = new Thread(task);

        // Before start
        System.out.println("State after creation: " + t.getState());

        t.start();

        Thread.sleep(100); // to catch TIMED_WAITING
        System.out.println("State after start: " + t.getState());

        t.join();
        System.out.println("State after join: " + t.getState());
    }
}
