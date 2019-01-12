//GRID_LAYOUT PROGRAM

import java.applet.*;
import java.awt.*;

//<applet code = "l2.class" height = 400 width = 400></applet>

public class l2 extends Applet {
	public void init() {
		Label l1,l2,l3;
		TextField t1,t2,t3;
		setLayout(new GridLayout(3,2)); //(row, column)
		l1 = new Label("First name");
		l2 = new Label("Last name");
		l3 = new Label("Password");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
	}
}