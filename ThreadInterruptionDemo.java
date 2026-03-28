/* Write a Java program to demonstrate thread interruption 
using interrupt() and handle InterruptedException properly.*/

class DataDownloader extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Downloading chunk...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Download cancelled by user. Cleaning up resources...");
        }
    }
}

public class ThreadInterruptionDemo{
    public static void main(String[] args) throws Exception {
        DataDownloader d = new DataDownloader();
        d.start();

        Thread.sleep(5000);
        d.interrupt();
    }
}

