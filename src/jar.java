import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jar {

	public static void main(String[] args) {
		
	    String Server = "VENKAT";//"DESKTOP-VO6JFBO"
		int port = 1433;//3858
		String user="VENKAT";  // sa , SQL Server, MSSQLSERVER
		String password="venkat123";
		String database="new";
		String jdbcurl;
		Connection con=null;
		
		try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//System.out.println("Loading the driver is susccesful...");
		}
		catch(Exception e){
			//System.out.println("Loading the driver is failed..");
			e.printStackTrace();
			
		}
	    jdbcurl="jdbc:sqlserver://"+Server+":"+port+";user="+user+";password="+password+";databasename="+database+"";
	    //db.dbConnect("jdbc:sqlserver://{computer-name}\\SQLEXPRESS:1433;databaseName=abc;integratedSecurity=true;","sa","password");
	    
	    
		try{
			
		 con = DriverManager.getConnection(jdbcurl);
		 System.out.println("rig done..");
		 
		}catch(SQLException e){
			System.out.println("not regis...");
			e.printStackTrace();
		}
		try{
			PreparedStatement pst=con.prepareStatement("select * from user");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("id= "+rs.getInt("id")+"user= "+rs.getString("name"));
				}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
