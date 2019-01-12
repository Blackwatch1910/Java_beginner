import java.applet.Applet;
import java.awt.*;

//<applet code = "Chess.class" width = 400 height = 400></applet>

public class Chess extends Applet {
	public void paint(Graphics g) {
		int x = 0;
		int y = 0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++) {
				if((i+j)%2 == 0)	
					g.setColor(Color.black);
				else
					g.setColor(Color.white);
			g.fillRect(x,y,50,50);
			x+=50;
			}
			x = 0;
			y+=50;						
		}
	}
}