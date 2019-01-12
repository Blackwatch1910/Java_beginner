//ADJUSTMENT_EVENT

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "eh5.class" height = 400 width = 400></applet>

public class eh5 extends Applet implements AdjustmentListener {
	Scrollbar sb1, sb2, sb3;
	Color c;
	int rr,gg,bb;

	public void init() {
		setLayout(new GridLayout(4,1));
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,-1,265);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,-1,265);
		sb3 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,-1,265);

		add(sb1);
		add(sb2);
		add(sb3);

		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		rr = sb1.getValue();
		gg = sb2.getValue();
		bb = sb3.getValue();
		repaint();
	}

	public void paint(Graphics g) {
		c = new Color(rr,gg,bb);
		g.setColor(c);
		g.fillRect(50,300,300,100);
	}
}