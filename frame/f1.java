import java.awt.*;
public class f1 extends Frame
 {
	Label l1,l2;
	TextField t1,t2;
	Button b;

	public f1() 
	{
		setSize(400,400);
		setLayout(null);
		setTitle("MyFrame Window");
		l1 = new Label("Enter your name");
		l1.setBounds(50,50,150,20);
		add(l1);
		t1 = new TextField(10);
		t1.setBounds(220,50,200,20);
		add(t1);
        l2 = new Label("Password");
		l2.setBounds(50,100,150,20);
		add(l2);
		t2 = new TextField(10);
		t2.setBounds(200,100,100,20);
		add(t2);
		b = new Button("Submit");
		b.setBounds(100,150,70,30);
		add(b);
		setVisible(true);
	}
	public static void main(String []args) 
	{
	new f1();
	}
}