package ActionListener;

public class BankMVCTest {
    public static void main(String[] args) {
        new BankController(new BankModel() ,new BankView());
    }
}
