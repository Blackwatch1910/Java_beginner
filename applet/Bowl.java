import java.applet.Applet;
import java.awt.*;

//<applet code = "Bowl.class" height = 400 width = 400></applet>

public class Bowl extends Applet implements Runnable {
	int x, y;
	int incx, incy;	//rate of moving

	public void init() {
		x = 200;
		y = 0;
		incx = 1;
		incy = 1;
	}

	public void start() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		while(true) {
			repaint();
			try{
				Thread.sleep(10);
			}
			catch(Exception e){

			}

			if(x + 40 > 400)
				incx = -1;
			if(x < 10)
				incx = 1;
			if(y + 40 > 400)
				incy = -1;
			if(y < 10)
				incy = 1;
			
			
			x = x+incx;
			y = y+incy;
		}
	}

	public void paint(Graphics g) {
		if(x >= 355 && y >= 167)
			g.setColor(Color.red);
		else if(x <= 188 && y <= 30)
			g.setColor(Color.blue);
		g.fillOval(x,y,40,40);
		}
		public void stop() {
			System.out.println("x:" +x);
			System.out.print("y:" +y);
		}
	}