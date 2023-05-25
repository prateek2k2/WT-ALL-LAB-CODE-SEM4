import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Q21 extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton addBtn;
    JButton next;

    public Q21() {
        super("next page viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        num1 = new JTextField(10);
        num2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        
        addBtn = new JButton("ADD");
        next = new JButton("NEXT PAGE");
        JPanel panel;
        panel=new JPanel();
        panel.add(new JLabel("Enter first number: "));
        panel.add(num1);
        panel.add(new JLabel("Enter second number: "));
        panel.add(num2);
        panel.add(new JLabel("Result: "));
        panel.add(result);
        panel.add(addBtn);
        panel.add(next);
        addBtn.addActionListener(this);
        next.addActionListener(this);
    }

    public static void main(String[] args) {
        new Q21();
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        if (e.getSource() == addBtn) 
        {
            result.setText(Integer.toString(a + b));
        } else if (e.getSource() == next) {
            setVisible(false);
            multiply mul=new multiply();
            mul.setVisible(true);
        }
    }
}