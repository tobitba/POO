package Ej7;
public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id) {
        super(id);
    }

    @Override
    protected boolean canExtract(double amount){
        return this.getBalance() - amount >= 0;
         
    }
    
}
