package precursor.dbinfo;
import java.sql.*;
public class CrudOperation
{
private static Connection con=null;
public static Connection createConnection()
{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:8080/Kanishk","root","root");
	}
	catch(SQLException|ClassNotFoundException cse)
	{
		System.out.println(cse);
	}
return con;
}
}
