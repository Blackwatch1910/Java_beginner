//ITEMEVENT

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "eh3.class" height = 500 width = 400></applet>

public class eh3 extends Applet implements ItemListener {
	Label l1;
	Choice ch;

	public void init() {
		l1 = new Label("   ");
		ch = new Choice();
		ch.add("Lucknow");
		ch.add("New Delhi");
		ch.add("Gurugram");

		add(ch);
		add(l1);
		ch.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		l1.setText(ch.getSelectedItem());
	}
} 