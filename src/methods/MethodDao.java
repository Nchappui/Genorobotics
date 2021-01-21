package methods;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Generates and the query and executes it
 * 
 * @author Nolan
 *
 */
public class MethodDao {

	public int registerMethod(MethodBean methodBean) throws ClassNotFoundException {

		String methodType= methodBean.getMethodType();
		switch(methodType)
		{
		case "Amplification":
			return addMethodtoAmplificationTable(methodType, methodBean);
		case "Extraction":
			return addMethodtoExtractionTable(methodType, methodBean);
		case "Collection":
			return addMethodtoCollectionTable(methodType, methodBean);
		case "Sequencing":
			return addMethodtoSequencingTable(methodType, methodBean);
		case "Taxonomic":
			return addMethodtoTaxonomicTable(methodType, methodBean);
		}
		return 0;

	}

	private int addMethodtoAmplificationTable(String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

				// Step 2:Create a statement using connection object

				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into methods (Method_name, Method_description, Method_type) values (? , ? , ?);insert into `amplification methods` (Amplification_method_name) values (?) ")) {
			preparedStatement.setString(1, methodBean.getMethodName());
			preparedStatement.setString(2, methodBean.getMethodDescription());
			preparedStatement.setString(3, methodType);
			preparedStatement.setString(4, methodBean.getMethodName());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}

		return result;	
	}

	private int addMethodtoExtractionTable(String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

				// Step 2:Create a statement using connection object

				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into methods (Method_name, Method_description, Method_type) values (? , ? , ?);insert into `extraction methods` (Extraction_method_name) values (?) ")) {
			preparedStatement.setString(1, methodBean.getMethodName());
			preparedStatement.setString(2, methodBean.getMethodDescription());
			preparedStatement.setString(3, methodType);
			preparedStatement.setString(4, methodBean.getMethodName());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}

		return result;	
	}

	private int addMethodtoSequencingTable(String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

				// Step 2:Create a statement using connection object

				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into methods (Method_name, Method_description, Method_type) values (? , ? , ?);insert into `sequencing methods` (Sequencing_method_name) values (?) ")) {
			preparedStatement.setString(1, methodBean.getMethodName());
			preparedStatement.setString(2, methodBean.getMethodDescription());
			preparedStatement.setString(3, methodType);
			preparedStatement.setString(4, methodBean.getMethodName());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}

		return result;	
	}

	private int addMethodtoTaxonomicTable(String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

				// Step 2:Create a statement using connection object

				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into methods (Method_name, Method_description, Method_type) values (? , ? , ?);insert into `taxonomic methods` (Taxonomic_method_name) values (?) ")) {
			preparedStatement.setString(1, methodBean.getMethodName());
			preparedStatement.setString(2, methodBean.getMethodDescription());
			preparedStatement.setString(3, methodType);
			preparedStatement.setString(4, methodBean.getMethodName());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}

		return result;	
	}

	private int addMethodtoCollectionTable(String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

				// Step 2:Create a statement using connection object

				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into methods (Method_name, Method_description, Method_type) values (? , ? , ?);insert into `collection methods` (Collection_method_name) values (?) ")) {
			preparedStatement.setString(1, methodBean.getMethodName());
			preparedStatement.setString(2, methodBean.getMethodDescription());
			preparedStatement.setString(3, methodType);
			preparedStatement.setString(4, methodBean.getMethodName());

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
