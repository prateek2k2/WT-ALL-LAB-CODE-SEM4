import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class first extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton addBtn;
    JButton next;
    JLabel a1, a2, a3;

    public first() 
    {
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
        a1=new JLabel("Enter first number: ");
        a2=new JLabel("Enter second number: ");
        a3=new JLabel("Result: ");
        setLayout(new GridLayout(7,1));
        JPanel panel;
        panel=new JPanel();
        panel.add(a1);
        panel.add(num1);add(panel);
        panel=new JPanel();
        panel.add(a2);
        panel.add(num2);add(panel);
        panel=new JPanel();
        panel.add(a3);
        panel.add(result);add(panel);
        panel=new JPanel();
        panel.add(addBtn);
        panel.add(next);
        add(panel);

        addBtn.addActionListener(this);
        next.addActionListener(this);
    }

    public static void main(String[] args) {
        new first();
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        if (e.getSource() == addBtn) {
            result.setText(Integer.toString(a + b));
        } else if (e.getSource() == next) {
            setVisible(false);
            second sec=new second();
            sec.setVisible(true);
        }
    }
}