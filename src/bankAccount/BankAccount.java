package bankAccount;

public class BankAccount {
    private int saldo; //attribut

    //konstruktor
    public BankAccount(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void insert(int amount) {
        this.saldo += amount;
    }

    public boolean withdraw(int amount) {
        if (this.saldo>= amount) {
            this.saldo -= amount;
            return true;
        }
        return false;

    }

}
