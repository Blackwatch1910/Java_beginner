//GRID_BAG PROGRAM

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "l4.class" height = 400 width = 400></applet>

public class l4 extends Applet {
	public void init() {
		resize(200,200);
		Button bx[] = new Button[6];
		int x[] = {0,1,2,0,0,1};	//x axis for all buttons
		int y[] = {0,0,0,1,2,2};	//y axis for all buttons
		int w[] = {1,1,1,2,1,2};	//width for all buttons
		int h[] = {1,1,2,1,1,1};	//height for all buttons
		GridBagLayout b = new GridBagLayout();

		GridBagConstraints c[] = new GridBagConstraints[6];
		setLayout(b);
		for(int i = 0; i < bx.length; i++) {
			bx[i] = new Button("Button "+i);
			c[i] = new GridBagConstraints();
			c[i].gridx = x[i];
			c[i].gridy = y[i];
			c[i].gridwidth = w[i];
			c[i].gridheight = h[i];
			c[i].fill = GridBagConstraints.BOTH;
			b.setConstraints(bx[i],c[i]);
			add(bx[i]);
		}
	}
}