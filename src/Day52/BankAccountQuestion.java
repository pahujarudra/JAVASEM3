package Day52;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public int checkBalance() {
        return balance;
    }
}

public class BankAccountQuestion {
    public static void main(String[] args) {
        BankAccount pnb = new BankAccount(1000);
        pnb.deposit(500);
        pnb.withdraw(100);
        System.out.println(pnb.checkBalance());
    }
}
