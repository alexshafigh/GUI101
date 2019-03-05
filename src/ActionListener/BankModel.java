package ActionListener;

import java.util.Observable;

public class BankModel extends Observable {
    BankAccount bankAccount ;

    public BankModel() {
    }

    public void delete(){

    }

    public  void createAccount(Float number ,String owner , Double balance ){
        bankAccount = new BankAccount(number , owner , balance);
        System.out.println(" New Bank Account Created");
        setChanged();
        notifyObservers(bankAccount);

    }

    public void view(){

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
