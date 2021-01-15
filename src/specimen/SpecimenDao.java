package specimen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class SpecimenDao {
	
	public int registerSpecimen(SpecimenBean specimenBean) throws ClassNotFoundException {
        Integer randomNum = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        String rnum = randomNum.toString();
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "test");

            // Step 2:Create a statement using connection object
        		
            PreparedStatement preparedStatement = connection
            .prepareStatement("insert into specimen \r\n"
            		+ "(Specimen_storing_ID, Extra_infos, Measurement_type, Image, Image_timestamp, Image_description, \r\n "
            		+ "Image_copyright, Host, Sex, Life_stage, Reproduction, Collection_method_name,\r\n"
            		+ "Taxonomic_method_name, Taxonomic_timestamp, Collection_timestamp, Taxonomy, \r\n"
            		+ " Collection_area, Collection_elevation, Collection_GPS)\r\n"
            		+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,\r\n"
            		+ " ?, ?; ?; ?; ?; ?; ?; ?; ?, ?; ?; ?; ?; ?, ?, POINT(?,?))")) {
        	preparedStatement.setString(1, rnum);
            preparedStatement.setString(2, specimenBean.getExtraInfos());
            preparedStatement.setString(3, specimenBean.getMeasurementType());
            preparedStatement.setString(4, specimenBean.getImage());
            preparedStatement.setString(5, specimenBean.getImageDescription());
            preparedStatement.setString(6, specimenBean.getImageCopyright());
            preparedStatement.setString(7, specimenBean.getHost());
            preparedStatement.setString(8, specimenBean.getSex());
            preparedStatement.setString(9, specimenBean.getLifeStage());
            preparedStatement.setString(10, specimenBean.getReproduction());
            preparedStatement.setString(11, specimenBean.getCollectionMethodName());
            preparedStatement.setString(12, specimenBean.getTaxonomicMethodName());
            preparedStatement.setString(13, specimenBean.getTaxonomicTimestamp());
            preparedStatement.setString(14, specimenBean.getCollectionTimestamp());
            preparedStatement.setString(15, specimenBean.getTaxonomy()[0]);
            preparedStatement.setString(16, specimenBean.getTaxonomy()[1]);
            preparedStatement.setString(17, specimenBean.getTaxonomy()[2]);
            preparedStatement.setString(18, specimenBean.getTaxonomy()[3]);
            preparedStatement.setString(19, specimenBean.getTaxonomy()[4]);
            preparedStatement.setString(20, specimenBean.getTaxonomy()[5]);
            preparedStatement.setString(21, specimenBean.getTaxonomy()[6]);
            preparedStatement.setString(22, specimenBean.getTaxonomy()[7]);
            preparedStatement.setString(23, specimenBean.getCollectionArea()[0]);
            preparedStatement.setString(24, specimenBean.getCollectionArea()[1]);
            preparedStatement.setString(25, specimenBean.getCollectionArea()[2]);
            preparedStatement.setString(26, specimenBean.getCollectionArea()[3]);
            preparedStatement.setString(27, specimenBean.getCollectionArea()[4]);
            preparedStatement.setString(28, specimenBean.getCollectionElevation());
            preparedStatement.setString(29, specimenBean.getCollectionGPSX());
            preparedStatement.setString(30, specimenBean.getCollectionGPSY());
            
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
