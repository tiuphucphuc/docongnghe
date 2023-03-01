package do_cong_nghe.connect;

import java.sql.Connection;
import java.sql.DriverManager;
public class database {
	
	private static Connection connection;
	
	public static synchronized Connection getConnection() {
		
		String strcon = "jdbc:mysql://localhost/do_cong_nghe";
		String user = "root";
		String pass = "";
		if(connection != null) {
			return connection;
		}else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(strcon, user, pass);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		return connection;
	}
	
	public static synchronized void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else {
			
		}
	}
}
