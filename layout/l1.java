//FLOW_LAYOUT PROGRAM

import java.applet.Applet;
import java.awt.*;

//<applet code = "l1.class" height = 400 width = 400></applet>

public class l1 extends Applet {
	public void init() {
		Label l1,l2,l3;
		TextField t1;
		setLayout(new FlowLayout(FlowLayout.LEFT));
		l1 = (new Label("Branch",Label.CENTER));
		l2 = (new Label("Branch code",Label.CENTER));
		t1 = (new TextField(10));
		add(l1);	//add(new Label("Branch",Label.CENTER));
		add(l2);	//add(new Label("Branch code",Label.CENTER));
		add(t1);	//add(new TextField(10));
	}
}