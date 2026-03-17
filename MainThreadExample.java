/*7-03-26 Create two threads: one using Thread class to print numbers and 
another using Runnable to print letters. 
Run both simultaneously.*/

// Thread using extends
class NumberPrinter extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

// Thread using Runnable
class LetterPrinter implements Runnable {

    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
        }
    }
}

public class MainThreadExample {

    public static void main(String[] args) {

        NumberPrinter t1 = new NumberPrinter();
        Thread t2 = new Thread(new LetterPrinter());

        t1.start();
        t2.start();
    }
}