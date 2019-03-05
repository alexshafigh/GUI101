package Exercise13;

import javax.swing.*;
import java.awt.*;

public class MyForm {
    JFrame jFrame ;
    JMenu jMenu;
    JMenuItem jMenuItem;
    JMenuBar jMenuBar;

    public MyForm() {
        jFrame = new JFrame(" My Banking Services ");
        jMenu = new JMenu("Banking Services ");
        jMenuItem = new JMenuItem("Item1");

        jMenu.add(jMenuItem);
        jMenuBar  = new JMenuBar();
        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);

        JLabel number = new JLabel("Number");
        JTextField jTextFieldNumber = new JTextField();


        JLabel owner = new JLabel("Owner");
        JTextField jTextFieldOwner = new JTextField();

        JLabel balance = new JLabel("Balance");
        JTextField jTextFieldBalance = new JTextField();


        JButton jButtonView = new JButton("View");
        JButton jButtonCreate = new JButton("Create");
        JButton jButtonDelete = new JButton("Delete");


        jFrame.add(number );
        jFrame.add(jTextFieldNumber );

        jFrame.add(owner);
        jFrame.add(jTextFieldOwner);

        jFrame.add(balance);
        jFrame.add(jTextFieldBalance);

        jFrame.add(jButtonView);
        jFrame.add(jButtonCreate);
        jFrame.add(jButtonDelete);


//        JFrame.setL


        jFrame.setLayout(new BorderLayout(400,400));
        jFrame.setSize(100,200);
        jFrame.setVisible(true);





    }


    public static void main(String[] args) {
        MyForm myForm = new MyForm();
    }
}
