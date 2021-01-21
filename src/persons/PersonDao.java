package persons;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionToMySQL;

/**
 * Generates and the query and executes it
 * 
 * @author Nolan
 *
 */

public class PersonDao {

	public int registerPerson(PersonBean personBean) throws ClassNotFoundException {
		int result = 0;


		try {
			ConnectionToMySQL connect = new ConnectionToMySQL();
			Connection connection = connect.connectToDatabase();
			// Step 2:Create a statement using connection object

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into person (Email, Fullname) values (? , ?)");
			preparedStatement.setString(1, personBean.getEmail());
			preparedStatement.setString(2, personBean.getFullname());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return result;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e: ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
