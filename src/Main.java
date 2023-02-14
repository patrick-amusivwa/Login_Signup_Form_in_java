import javax.swing.*;

public class Main {
    public static void main(String[] args) {
         new LoginForm();
    }
}
class LoginForm extends JFrame{
    ImageIcon loginIcon =  new ImageIcon("src/assets/loginIcon.png");
    JPanel PFname  =   new JPanel();
    JTextField TFname = new JTextField();
    JLabel LFname = new JLabel();
    JPanel Plname = new JPanel();

    JTextField Tlname = new JTextField();
    JLabel Llname = new JLabel();
    JPanel PUname = new JPanel();

    JTextField FUame = new JTextField();
    JLabel LUname = new JLabel();
    JPanel PEmail = new JPanel();
    JTextField TEmail = new JTextField();
    JLabel LEmail = new JLabel();
    JPanel radioButtons = new JPanel();

    JRadioButton male = new JRadioButton();
    JRadioButton female = new JRadioButton();


    LoginForm(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(loginIcon.getImage());
        this.setLayout(null);



        this.setVisible(true);

    }

}
class SignupForm extends JFrame{
    SignupForm(){

    }

}