package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToMySQL {
	
	public Connection connectToDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			//TO CONNECT TO YOUR OWN MYSQL: REPLACE "root" & "test" WITH YOUR OWN USERNAME AND PASSWORD
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
