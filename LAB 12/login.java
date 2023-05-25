import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener
{
    JTextField a1,a2;
    JLabel l1,l2;
    JPanel p;
    JButton login;
    public login(){
        super("Login page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);
        l1=new JLabel ("Enter ID: ");
        l2=new JLabel ("Enter password: ");
        a1= new JTextField(10);
        a2= new JPasswordField(10);
        login= new JButton ("LOGIN");
        setLayout(new GridLayout(7,1));
        p=new JPanel();
        p.add(l1);
        p.add(a1);add(p);
        p=new JPanel();
        p.add(l2);
        p.add(a2);add(p);
        p=new JPanel();
        p.add(login);add(p);

        login.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String a= a1.getText();
        String b= a2.getText();

        if (e.getSource() == login) {
            setVisible(false);
            last ls= new last(a,b);
            ls.setVisible(true);
        }
    }
}
