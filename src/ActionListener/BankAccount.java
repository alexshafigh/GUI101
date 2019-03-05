package ActionListener;

public class BankAccount {
    private float number;
    private String owner;
    private Double balance;

    public BankAccount() {
    }

    public BankAccount(float number, String owner, Double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }


    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
