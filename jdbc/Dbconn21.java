import java.sql.*;
class Dbconn21
{
public static void main(String a[]) throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
try{
Connection c=DriverManager.getConnection("jdbc:odbc:mydriver","","");  
Statement st=c.createStatement();  
ResultSet rs=st.executeQuery("select*from login"); 
while(rs.next())
{
System.out.println(rs.getString(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
System.out.println("--------------");
}
}

catch(Exception e){
System.out.println(e);
}
}
}