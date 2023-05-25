import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class last extends JFrame implements ActionListener 
{
    JButton prevButton, exitButton;
    JLabel user,pass,a1,a2;

    public last(String a,String b) {
        super("EXIT PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        prevButton = new JButton("Previous");
        exitButton = new JButton("Exit");
        a1 =new JLabel("User Id:");
        a2 =new JLabel("Password:");
        user=new JLabel();
        user.setText(a);
        pass=new JLabel();
        pass.setText(b);
        setLayout(new GridLayout(7,1));
        JPanel panel;
        panel=new JPanel();
        panel.add(a1);
        panel.add(user);add(panel);
        panel=new JPanel();
        panel.add(a2);
        panel.add(pass);add(panel);
        panel=new JPanel();
        panel.add(exitButton);
        panel.add(prevButton);add(panel);

        prevButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            setVisible(false);
            login log=new login();
            log.setVisible(true);
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}