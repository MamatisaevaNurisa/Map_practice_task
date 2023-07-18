import java.util.Map;

public class BankAccount {
    private int balance;

    public BankAccount() {

    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public void addBalance(int money){
        this.balance+=money;
    }

    public void takeMoney (int money) {
        this.balance -= money;

    }

    }

