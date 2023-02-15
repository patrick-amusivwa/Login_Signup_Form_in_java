import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
         new LoginForm();
    }
}
class LoginForm extends JFrame implements ActionListener {

    //-----------------------------------JDBC-------------------------
    

    //---------------------------------------------------------------
    ImageIcon loginIcon =  new ImageIcon("src/assets/loginIcon.png");
    myPanels PFname,Plname,PUname,PEmail , radioButtons;



    JTextField Tfname,Tlname,TUame ,TEmail = new myTextFields();
    JLabel LFname, Llname,LUname,LEmail;



    JButton submit  =  new JButton("submit");



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
        LUname.setText("user name:");
        LUname.setHorizontalTextPosition(0);
        LUname.setVerticalTextPosition(0);

        LEmail = new JLabel();
        LEmail.setText("email:");
        LEmail.setHorizontalTextPosition(0);
        LEmail.setVerticalTextPosition(0);

        //-----------PANELS--------//
        Tfname = new myTextFields();
        PFname = new myPanels();
        PFname.add(LFname);
        PFname.add(Tfname);
        PFname.setBounds(10,10,300,40);

        Tlname = new myTextFields();
        Plname = new myPanels();
        Plname.add(Llname);
        Plname.add(Tlname);
        Plname.setBounds(10,60,300,40);

        TUame = new myTextFields();
        PUname = new myPanels();
        PUname.add(LUname);
        PUname.add(TUame);
        PUname.setBounds(10,140,300,40);

        TEmail = new myTextFields();
        PEmail = new myPanels();
        PEmail.add(LEmail);
        PEmail.add(TEmail);
        PEmail.setBounds(10,195,300,40);

        submit.setBounds(120,250,100,30);

        //------------------JFrame properties----------------//
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(loginIcon.getImage());
        this.setLayout(null);

        //-----------------adding panels------------------------//
        this.add(PFname);
        this.add(Plname);
        this.add(PUname);
        this.add(PEmail);
        this.add(submit);


        //----------------------------------------------------------





        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){

        }
    }
}
class SignupForm extends JFrame{
    SignupForm(){

    }

}