import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jaa 
{
	public static void main(String[] args) 
	{
		Connection databaseConnection = null;
		try
		{
			//Step 1
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Class.forName("com.mysql.jdbc.Driver");	
			System.out.println("Loading the driver is successful..");
			
			//Step 2
			// db.dbConnect("jdbc:sqlserver://{computer-name}\\SQLEXPRESS:1433;databaseName=abc;integratedSecurity=true;","sa","password");
			databaseConnection = DriverManager.getConnection("jdbc:sqlserver://VENKAT\\SQLEXPRESS:1433", "VENKAT", "venkat123");
			
			System.out.println("Obtaining Connection to database is successful..");

			//Step 3
			
			Statement statement = databaseConnection.createStatement();
			
			//Step 4
			ResultSet resultSet = statement.executeQuery("select * from emp");
			
			System.out.println();
			
			//Fetching results by index position - Approach 1
			while( resultSet.next() )
			{
				String currentRow = resultSet.getInt(1) + " "+ resultSet.getString(2) +" "+
									resultSet.getString(3)+ " "+resultSet.getInt(4);
				
				System.out.println( currentRow );
			}
			
			//Fetching results by index position - Approach 2
			/*while( resultSet.next() )
			{
				String currentRow = resultSet.getInt("id") + " "+ resultSet.getString("name") +" "+
									resultSet.getString("position")+ " "+resultSet.getInt("salary");
				
				System.out.println( currentRow );
			}*/
			
		}
		catch(Exception e)
		{
			System.out.println("Exception has occurred..");
			e.printStackTrace();
		}
		finally
		{
			if( databaseConnection != null )
			{
				try 
				{
					databaseConnection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	}

	
/*	Connection con = null;
       try
       {
		//Step 1
		
		//Class.forName("com.mysql.jdbc.Driver");	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//System.out.println("Loading the driver is successful..");
		
		//Step 2 DESKTOP-VO6JFBO\SQLEXPRESS
		//databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:1111/myjpadb", "root", "root");
		Connection con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433/VENKAT");
		//Connection con= DriverManager.getConnection("jdbc:odbc:looka");
		System.out.println("Obtaining Connection to database is successful..");

		//Step 3
		
		Statement statement = con.createStatement();
		
		//Step 4
	/*	int noOfRowsInserted = statement.executeUpdate("insert into myjpadb.emp values ( 4, 'Nikhil', 'Asst. Manager', 9000 )");
		
		System.out.println(noOfRowsInserted + " Rows inserted");
		
       } 
      Catch(SQLException se)
       {
    	   se.printStackTrace();
       }
}*/



