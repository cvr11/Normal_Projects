import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
//	public class InsertDemo {}

	public static void main(String[] args) {
		
		Connection databaseConnection = null;
		try
		{
			//Step 1
			Class.forName("com.mysql.jdbc.Driver");	
			System.out.println("Loading the driver is successful..");
			
			//Step 2
			databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi", "root", "venkat123");
			System.out.println("Obtaining Connection to database is successful..");

			//Step 3
			
			Statement statement = databaseConnection.createStatement();
			
			//Step 4
			int noOfRowsInserted = statement.executeUpdate("insert into emp values ( 11, 'Sirivasarao', 'JavaProgrammaer', 7000 )");
			
			System.out.println(noOfRowsInserted + " Rows inserted");
			
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

