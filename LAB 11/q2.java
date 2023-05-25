import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class q2 extends JFrame implements ActionListener
{
    int curentpage=1;
    private JTextField t1,t2,t3;
    private JButton b1,b2;
    private JLabel l1,l2;
    public q2()
    {
        setSize(500,500);
        setTitle("My window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        l1=new JLabel("Number 1:");
        p.add(l1);
        t1=new JTextField();
        p.add(t1);
        l2=new JLabel("Number 2:");
        p.add(l2);
        t2=new JTextField();
        p.add(t2);
        b1=new JButton("Add");
        t3=new JTextField();
        p.add(b1);
        p.add(t3);
        b1.addActionListener(this);
        b2=new JButton("Next");
        p.add(b2);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a,b,c;
        String s=ae.getActionCommand();
        if(s.equals("Add"))
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=a+b;
            b1.setText(String.valueOf(c));
        }
        else if(s.equals("Next"))
        {
            JTextField t1,t2,t3;
            JButton b0,b1,b2;
            JLabel l1,l2;
            setSize(500,500);
            setTitle("My window");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel p=new JPanel();
            l1=new JLabel("Number 1:");
            p.add(l1);
            t1=new JTextField();
            p.add(t1);
            l2=new JLabel("Number 2:");
            p.add(l2);
            t2=new JTextField();
            p.add(t2);
            b0=new JButton("Previous");
            p.add(b0);
            b1=new JButton("Mul");
            t3=new JTextField();
            p.add(b1);
            p.add(t3);
            b1.addActionListener(this);
            b2=new JButton("Next");
            p.add(b2);
            b2.addActionListener(this);
        }
    }
    public static void main(String[] args) 
    {
        new q2();    
    }
}