package methods;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class MethodDao {

	public int registerMethod(MethodBean methodBean) throws ClassNotFoundException {
        Integer randomNum = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        String rnum = randomNum.toString();
        String methodType= methodBean.getMethodType();
       	switch(methodType)
       	{
       	case "Amplification":
       		return addMethodtoAmplificationTable(rnum, methodType, methodBean);
       	case "Extraction":
       		return addMethodtoExtractionTable(rnum, methodType, methodBean);
       	case "Collection":
       		return addMethodtoCollectionTable(rnum, methodType, methodBean);
       	case "Sequencing":
       		return addMethodtoSequencingTable(rnum, methodType, methodBean);
       	case "Taxonomic":
       		return addMethodtoTaxonomicTable(rnum, methodType, methodBean);
       		
       	}
       	return 0;

    }

	private int addMethodtoAmplificationTable(String rnum, String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into methods (Method_ID, Method_description, Method_type) values (? , ? , ?);insert into `amplification methods` (Amplification_method_ID) values (?) ")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, methodBean.getMethodDescription());
            preparedStatement.setString(3, methodType);
            preparedStatement.setString(4, rnum);

            System.out.println(preparedStatement);
            //addToSecondTable(rnum, methodBean.getMethodType());
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        
        return result;	
	}
	
	private int addMethodtoExtractionTable(String rnum, String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into methods (Method_ID, Method_description, Method_type) values (? , ? , ?);insert into `extraction methods` (Extraction_method_ID) values (?) ")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, methodBean.getMethodDescription());
            preparedStatement.setString(3, methodType);
            preparedStatement.setString(4, rnum);

            System.out.println(preparedStatement);
            //addToSecondTable(rnum, methodBean.getMethodType());
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        
        return result;	
	}
	
	private int addMethodtoSequencingTable(String rnum, String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into methods (Method_ID, Method_description, Method_type) values (? , ? , ?);insert into `sequencing methods` (Sequencing_method_ID) values (?) ")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, methodBean.getMethodDescription());
            preparedStatement.setString(3, methodType);
            preparedStatement.setString(4, rnum);

            System.out.println(preparedStatement);
            //addToSecondTable(rnum, methodBean.getMethodType());
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        
        return result;	
	}
	
	private int addMethodtoTaxonomicTable(String rnum, String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into methods (Method_ID, Method_description, Method_type) values (? , ? , ?);insert into `taxonomic methods` (Taxonomic_method_ID) values (?) ")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, methodBean.getMethodDescription());
            preparedStatement.setString(3, methodType);
            preparedStatement.setString(4, rnum);

            System.out.println(preparedStatement);
            //addToSecondTable(rnum, methodBean.getMethodType());
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        
        return result;	
	}
	
	private int addMethodtoCollectionTable(String rnum, String methodType, MethodBean methodBean) throws ClassNotFoundException {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into methods (Method_ID, Method_description, Method_type) values (? , ? , ?);insert into `collection methods` (Collection_method_ID) values (?) ")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, methodBean.getMethodDescription());
            preparedStatement.setString(3, methodType);
            preparedStatement.setString(4, rnum);

            System.out.println(preparedStatement);
            //addToSecondTable(rnum, methodBean.getMethodType());
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
