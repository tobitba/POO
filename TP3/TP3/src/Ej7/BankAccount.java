package Ej7;

public abstract class BankAccount {
    private final int id;
    protected double balance;

    public void deposit(double amount){
        balance += amount;
    }
    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return balance;
    }

    public void extract(double amount){
        if(canExtract(amount)){
            balance -= amount;
        }
    }
    protected BankAccount(int id){
        this.id = id;
        balance = 0;
    }

    
    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id,balance);
    }
}
