import java.sql.*;

public class ss {
	public static void main(String[] args) {
	
	try

	{

	Driver d=new com.microsoft.sqlserver.jdbc.SQLServerDriver ();

	DriverManager.registerDriver (d);

	System.out.println ("DRIVERS LOADED...");

	Connection con=DriverManager.getConnection ("jdbc:odbc:oradsn","scott","tiger");

	System.out.println ("CONNECTION ESTABLISHED...");

	Statement st=con.createStatement ();

	int i=st.executeUpdate ("insert into student values (10,'suman',60.87);");

	System.out.println (i+" ROWS SELECTED...");

	con.close ();

	}

	catch (Exception e)

	{

	System.out.println ("DRIVER CLASS NOT FOUND...");

	}

}
}