//10-02-26 Global Bank Vault -Singleton concept

class BankVault {

    private static double totalVaultBalance = 0;

    public static void deposit(double amount) {
        totalVaultBalance += amount;
    }

    public static double getBalance() {
        return totalVaultBalance;
    }

    public static void main(String[] args) {

        BankVault user1 = new BankVault();
        BankVault user2 = new BankVault();
        BankVault user3 = new BankVault();

        user1.deposit(1000);
        user2.deposit(2000);
        user3.deposit(3000);

        System.out.println("Total Vault Balance: " + BankVault.getBalance());
    }
}
