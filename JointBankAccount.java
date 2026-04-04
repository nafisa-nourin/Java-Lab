

class BankAccount {
    private int balance = 1000;

    // Try removing synchronized first to see race condition
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            try {
                Thread.sleep(100);
            } catch (Exception e) {}

            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " completed withdrawal. Balance = " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class FamilyMember extends Thread {
    BankAccount acc;

    FamilyMember(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(1000);
    }
}

public class JointBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        FamilyMember t1 = new FamilyMember(acc);
        FamilyMember t2 = new FamilyMember(acc);

        t1.setName("User1");
        t2.setName("User2");

        t1.start();
        t2.start();
    }
}

