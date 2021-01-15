package persons;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;


public class PersonDao {
	
	public int registerPerson(PersonBean personBean) throws ClassNotFoundException {
        Integer randomNum = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        String rnum = randomNum.toString();
        int result = 0;


        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "test");

            // Step 2:Create a statement using connection object
        		
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into person (PersonID, Email, Fullname) values (? , ? , ?)")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, personBean.getEmail());
            preparedStatement.setString(3, personBean.getFullname());

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
