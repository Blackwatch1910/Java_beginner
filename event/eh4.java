//MOUSE_EVENT

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "eh4.class" height = 400 width = 400></applet>

public class eh4 extends Applet implements MouseListener,MouseMotionListener {
	Label l1;
	public void init() {
		l1 = new Label("     ");
		add(l1);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseMoved(MouseEvent e) {
		l1.setText("Mouse Moved X:"+e.getX()+" Y:"+e.getY());
	}

	public void mouseDragged(MouseEvent e) {
		l1.setText("Mouse Dragged X:"+e.getX()+" Y:"+e.getY());
	}

	public void mousePressed(MouseEvent e) {
		l1.setText("Mouse Pressed X:"+e.getX()+" Y:"+e.getY());
	}

	public void mouseReleased(MouseEvent e) {
		l1.setText("Mouse Released X:"+e.getX()+" Y:"+e.getY());
	}

	public void mouseEntered(MouseEvent e) {
		l1.setText("Mouse Entered X:"+e.getX()+" Y:"+e.getY());
	}

	public void mouseExited(MouseEvent e) {
		l1.setText("Mouse Exited X:"+e.getX()+" Y:"+e.getY());
	}

	public void mouseClicked(MouseEvent e) {
		l1.setText("Mouse Clicked X:"+e.getX()+" Y:"+e.getY());
	}
}