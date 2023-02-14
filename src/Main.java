import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
         new LoginForm();
    }
}
class LoginForm extends JFrame{
    ImageIcon loginIcon =  new ImageIcon("src/assets/loginIcon.png");
    myPanels PFname,plname,PUname,PEmail , radioButtons;



    JTextField Tfname,Tlname,FUame ,TEmail = new myTextFields();
    JLabel LFname, Llname,LUname,LEmail;


    JRadioButton male = new JRadioButton();
    JRadioButton female = new JRadioButton();


    LoginForm(){

        //------------------labels----------------//
        LFname= new JLabel();
        LFname.setText("first name:");
        LFname.setHorizontalTextPosition(0);
        LFname.setVerticalTextPosition(0);


        Llname = new JLabel();
        Llname.setText("last name:");
        Llname.setHorizontalTextPosition(0);
        Llname.setVerticalTextPosition(0);


        LUname = new JLabel();
        LUname.setText("last name:");
        LUname.setHorizontalTextPosition(0);
        LUname.setVerticalTextPosition(0);

        LEmail = new JLabel();
        LEmail.setText("last name:");
        LEmail.setHorizontalTextPosition(0);
        LEmail.setVerticalTextPosition(0);

        //-----------PANELS--------//
        Tfname = new myTextFields();
        PFname = new myPanels();
        PFname.add(LFname);
        PFname.add(Tfname);
        PFname.setBounds(10,10,300,40);








        //------------------JFrame properties----------------//
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(loginIcon.getImage());
        this.setLayout(null);

        //-----------------adding panels------------------------//
        this.add(PFname);

        //----------------------------------------------------------





        this.setVisible(true);

    }

}
class SignupForm extends JFrame{
    SignupForm(){

    }

}