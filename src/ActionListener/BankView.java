package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class BankView extends JFrame implements Observer {
    private JTextField result;
    private BankController bankController;
    private JTextField numberArea;
    private JTextField ownerArea;
    private JTextField balanceArea;

    public BankView(){
        JLabel numberLabel = new JLabel("Number");
        numberArea = new JTextField(15);

        JLabel ownerLabel = new JLabel("Owner");
        ownerArea = new JTextField(15);

        JLabel balanceLabel = new JLabel("Balance");
        balanceArea = new JTextField(15);

        JButton createButton = new JButton("Create");
        JButton viewButton = new JButton("View");
        JButton deleteButton = new JButton("Delete");

         result = new JTextField(15);



        Container  container = this.getContentPane();
        container.add(numberLabel);
        container.add(numberArea);
        container.add(ownerLabel);
        container.add(ownerArea);
        container.add(balanceLabel);
        container.add(balanceArea);
        container.add(createButton);
        container.add(viewButton);
        container.add(deleteButton);
        container.add(result);



        createButton.addActionListener( new BankController(new BankModel() , this));
        viewButton.addActionListener( new BankController(new BankModel() , this));



        this.setLayout(new FlowLayout());
        this.setSize(250,200);
        this.setVisible(true);
    }


    //when observable sends the changes this method will be fired
    @Override
    public void update(Observable o, Object arg) {
        BankAccount bankAccount = (BankAccount) arg;
        result.setText(((BankAccount) arg).getOwner());
        result.setEditable(false);
    }

    public JTextField getNumberArea() {
        return numberArea;
    }

    public JTextField getOwnerArea() {
        return ownerArea;
    }

    public JTextField getBalanceArea() {
        return balanceArea;
    }
}
