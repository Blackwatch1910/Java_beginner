import java.awt.*;
import java.applet.*;

//<applet code = "aw1.class" width = 500 height = 500></applet>

public class aw1 extends Applet {
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	TextArea ta;
	Choice ch;
	Checkbox c1,c2,c3,male,female;
	CheckboxGroup grp;
	List li;

	public void init() {
		l1 = new Label("Enter your username:-");
		t1 = new TextField(10);
		l2 = new Label("Enter your password");
		t2 = new TextField(10);
		b1 = new Button("Submit");
		li = new List(3);
		li.add("English");
		li.add("Hindi");
		li.add("Science");
		li.add("Maths");
		grp = new CheckboxGroup();
		male = new Checkbox("male", grp, false);
		female = new Checkbox("female", grp, false);
		c1 = new Checkbox("music");
		c2 = new Checkbox("Reading");
		c3 = new Checkbox("Cricket");
		ch = new Choice();
		ch.add("Select city");
		ch.add("New Delhi");
		ch.add("Lucknow");
		ch.add("Bangaluru");
		ch.add("New York");
		ta = new TextArea("type here...",5,10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(ta);
		add(ch);
		add(c1);
		add(c2);
		add(c3);
		add(male);
		add(female);
		add(li);
		add(b1);
	}
}