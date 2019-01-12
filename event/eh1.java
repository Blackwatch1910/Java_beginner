import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "eh1.class" width = 400 height = 400></applet>

public class eh1 extends Applet implements ActionListener {
	Label l1;
	TextField t1,t2;
	Button b1,b2;

	public void init() {
		l1 = new Label("   ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("Add");
		b2 = new Button("Sub");

		add(l1);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	} 

	public void actionPerformed(ActionEvent e) {
		int a,b,c;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		if(e.getSource() == b1) {
			c = a + b;
			l1.setText("Addition is:" +c);
		}
		else if (e.getSource() == b2) {
			c = a - b;
			l1.setText("Subtraction is:" +c);
		}
	}
}