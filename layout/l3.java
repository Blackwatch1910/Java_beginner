//BORDER_LAYOUT PRoGRAM

import java.applet.*;
import java.awt.*;

//<applet code = "l3.class" height = 400 width = 400></applet>

public class l3 extends Applet {
	public void init() {
		Button b1;
		Scrollbar sb1,sb2;
		TextField t1;
		Canvas c;
		setLayout(new BorderLayout(20,20));
		b1 = new Button("Submit");
		sb1 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
		c = new Canvas();
		c.setBackground(Color.green);
		t1 = new TextField("Type here...");
		add(b1,BorderLayout.SOUTH);
		add(sb1,BorderLayout.EAST);
		add(sb2,BorderLayout.WEST);
		add(c,BorderLayout.CENTER);
		add(t1,BorderLayout.NORTH);
	}
}