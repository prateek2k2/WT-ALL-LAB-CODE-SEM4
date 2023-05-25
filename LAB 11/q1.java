import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class q1 extends JFrame implements ActionListener 
{
    JButton blue, green, red;
    JPanel p;
    public q1() 
    {
        setSize(500, 500);
        p = new JPanel();
        blue = new JButton("Blue");
        green = new JButton("Green");
        red = new JButton("Red");
        blue.addActionListener(this);
        green.addActionListener(this);
        red.addActionListener(this);
        p.add(blue);
        p.add(green);
        p.add(red);
        add(p);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == blue) 
        {
            p.setBackground(Color.BLUE);
        }
         else if (e.getSource() == green) 
         {
            p.setBackground(Color.GREEN);
        } 
        else if (e.getSource() == red)
        {
            p.setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new q1();
    }
}