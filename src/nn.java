
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class nn {
	


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

	


