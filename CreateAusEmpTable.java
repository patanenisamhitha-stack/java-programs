import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateAusEmpTable 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:oracle:thin:@localhost:1521/FREE";
		String username = "system";  // Change if using a different user
		String password ="sys";  // Change to your Oracle password
		Connection conn = null;
		Statement stmt = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
         			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to Oracle database successfully.");
			String createTableSQL = "CREATE TABLE ausemp (empno NUMBER							(5),empname VARCHAR2(30),salary NUMBER(10, 2))";
			stmt = conn.createStatement();
			stmt.executeUpdate(createTableSQL);
			System.out.println("Table 'ausemp' created successfully.");
		} 
		catch (ClassNotFoundException e) 
		{
		System.out.println("Oracle JDBC Driver not found. Please add ojdbc14.jar to classpath.");
		e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			System.out.println("SQL Error occurred.");
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (stmt != null) 
					stmt.close();
				if (conn != null) 
					conn.close();
				System.out.println("Database resources closed.");
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}