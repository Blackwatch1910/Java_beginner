//TextEvent

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "eh2.class" height = 500 width = 500></applet>

public class eh2 extends Applet implements TextListener {
	Label l1;
	TextField t1;
	public void init() {
		l1 = new Label("    ");
		t1 = new TextField(10);
		add(t1);
		add(l1);
		t1.addTextListener(this);
	}

	public void textValueChanged(TextEvent e) {
		l1.setText(t1.getText());
	}
}