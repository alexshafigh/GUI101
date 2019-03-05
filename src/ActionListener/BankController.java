package ActionListener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankController implements ActionListener {
    private BankModel bankModel ;
    private BankView  bankView;


    public BankController(BankModel bankModel, BankView bankView) {

        this.bankModel = bankModel;
        this.bankView = bankView;
        bankModel.addObserver(bankView);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (bankModel.bankAccount != null) {
//        if (e.p)



            BankAccount bankAccount = bankModel.bankAccount;
//        }
//        else {
            bankModel.createAccount(Float.parseFloat(bankView.getNumberArea().getText()), bankView.getOwnerArea().getText() , Double.parseDouble(bankView.getBalanceArea().getText()));
//        }
    }
}
