import java.applet.*;
import java.awt.*;

/* <applet code="face.class"height=600 width=800></applet> */

public class face extends Applet

{
int x[]={500,400,600,500};
int y[]={400,350,350,400};
 public void init()
 {
  setBackground(Color.white);
 }
 	public void paint(Graphics g)
{
	g.setColor(Color.red);
	g.drawRoundRect(300,200,400,300,400,400);
	g.fillRoundRect(300,200,400,300,400,400);
	g.setColor(Color.blue);
	g.drawRoundRect(350,250,100,75,100,100);
	g.fillRoundRect(350,250,100,75,100,100);
	g.drawRoundRect(550,250,100,75,100,100);
	g.fillRoundRect(550,250,100,75,100,100);
	g.setColor(Color.black);
	g.drawRoundRect(380,270,50,48,50,45);
	g.fillRoundRect(380,270,50,48,50,45);
	g.drawRoundRect(580,270,50,48,50,45);
	g.fillRoundRect(580,270,50,48,50,45);
	g.setColor(Color.yellow);
	g.fillPolygon(x,y,4);
	
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	g.drawString(d.width+","+d.height,10,10);
}
}