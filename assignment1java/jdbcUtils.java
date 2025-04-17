package Example.jdbc;
// this is utility class used for obtaining a connection
import java.sql.Connection;
import java.sql.DriverManager;
public class jdbcUtils {
	public static Connection buildConnection() throws Exception
	{
		String connectionUrl="jdbc:mysql://localhost:3306/cdac";
		String userName="root";
		String password="password";
        Connection dbConnection=
        		DriverManager.getConnection(connectionUrl,userName,password);
		return dbConnection;
	}
	public static void main(String[] args) {
		try {
			buildConnection();
			System.out.println("got the conection");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
