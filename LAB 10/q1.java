//DRAW INDIAN FLAG
import java.applet.*;
import java.awt.*;

public class q1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(150,50,10,500);
		g.setColor(Color.orange);
		g.fillRect(160,50,200,50);
		g.setColor(Color.white);
		g.fillRect(160,100,200,50);
		g.setColor(Color.green);
		g.fillRect(160,150,200,50);
		g.setColor(Color.gray);
		g.fillRect(80,550,150,50);
		g.setColor(Color.black);
		g.drawCirc(240,100,50,50);
		g.setColor(Color.blue);
		g.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
	}
}
/*<html>
<applet code="q1.java" width=500 height=800 > 
</applet>
</html> */