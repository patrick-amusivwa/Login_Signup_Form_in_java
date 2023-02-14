import javax.swing.*;

public class Main {
    public static void main(String[] args) {
         new LoginForm();
    }
}
class LoginForm extends JFrame{
    LoginForm(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        this.setVisible(true);

    }

}
class SignupForm extends JFrame{
    SignupForm(){

    }

}