//Calculator
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class q2 extends Applet implements ActionListener{ 
Label l1,l2,l3,l4;
TextField t1,t2;
Button sum,dif,mul,div;
int a,b; 
float c;
public void init(){
l1=new Label("Enter num 1: "); 
l2=new Label("Enter num 2: "); 
l3=new Label("Output: ");
l4=new Label("");
t1=new TextField(20);
t2=new TextField(20);
sum=new Button("add");
dif=new Button("subtract"); 
mul=new Button("multiply"); 
div=new Button("divide");
add(l1); 
add(t1); 
add(l2); 
add(t2); 
add(sum);
add(dif); 
add(mul); 
add(div);
add(l3); 
add(l4);
sum.addActionListener(this); 
dif.addActionListener(this); 
mul.addActionListener(this); 
div.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){ 
String action=ae.getActionCommand();
a=Integer.parseInt(t1.getText()); 
b=Integer.parseInt(t2.getText()); 
if(action.equals("add")){
c=a+b; 
l4.setText(String.valueOf(c));
}
else if(action.equals("subtract")){ 
c=a-b;
l4.setText(String.valueOf(c));
}
else if(action.equals("multiply")){ 
c=a*b;
l4.setText(String.valueOf(c));
}
else if(action.equals("divide")){ 
try{
c=a/b; 
l4.setText(String.valueOf(c));
}
catch(ArithmeticException e){ 
l4.setText("invalid input"); }
}
}
}
/*<html>
<applet code="q2.class" height=400 width=400> 
</applet>
</html>
*/