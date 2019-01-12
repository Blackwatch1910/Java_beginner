import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import sun.jdbc.odbc.*;
public class FrDbDemo extends Frame implements ActionListener
{
Label l1;
TextField t1,t2;
Button b1,b2;
Connection con;
Statement smt;
ResultSet rs;
public FrDbDemo()
{
setSize(400,400);
setTitle("Database Demo");
setLayout(null);
t1=new TextField(10);
t1.setBounds(50,50,150,20);
add(t1);
t2=new TextField(10);
t2.setBounds(50,100,150,20);
add(t2);
b1=new Button("Register");
b1.setBounds(100,150,70,30);
add(b1);
b2=new Button("Login");
b2.setBounds(200,150,70,30);
add(b2);
l1=new Label("                                          ");
l1.setBounds(50,200,350,20);
add(l1);
setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con=DriverManager.getConnection("jdbc:odbc:shaktiman","","");	
	smt=con.createStatement();
		if(e.getSource()==b1)
		{
		String s1="insert into Login values('"+t1.getText()+"',"+Integer.parseInt(t2.getText())+")";		
		if(smt.executeUpdate(s1)>0)
			{
			l1.setText("U r register successfully !!!!");
			}
		}		
		else if(e.getSource()==b2)
		{
		String s2="select * from Login where UserName='"+t1.getText()+"' and Password="+Integer.parseInt(t2.getText())+"";
		rs=smt.executeQuery(s2);
			if(rs.next())
			{
			l1.setText("Login Successfully !!!!");
			}
			else
			{
			l1.setText("UserName or Password is incorrect !!!!");
			}
		}
			
	}
	catch(Exception e1)
	{
	}
}
public static void main(String args[])
{
new FrDbDemo();
}
}