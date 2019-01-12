import java.applet.Applet;
import java.awt.*;

//<applet code = "app2.class" width = 400 height = 400></applet>

public class app2 extends Applet {
	public void paint(Graphics g) {
		g.drawRect(25, 10, 50, 75);		//(x-axis,y-axis,width,height)
		g.drawRoundRect(100, 10, 50, 75, 30, 50);	//(x-axis,y-axis,width,height,arcwidth,archeight)
		g.draw3DRect(175, 10, 50, 75, true);	//(x-axis,y-axis,width,height,boolean raised)
		g.drawLine(20, 150, 400, 40);	//(initial x-axis,initial y-axis,final x-axis,final y-axis)
		g.fillRect(25, 110, 50, 50);	//(x-axis,y-axis,width,height)
		g.drawString("My drawings", 10, 180);	//(String, x-axis, y-axis)
	}
}