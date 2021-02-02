package specimen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionToMySQL;
import utils.KeyGenerator;

/**
 * Generates and the query and executes it
 * 
 * @author Nolan
 *
 */

public class SpecimenDao {

	public int registerSpecimen(SpecimenBean specimenBean) throws ClassNotFoundException {
		KeyGenerator kg = new KeyGenerator();
		String key= kg.GenerateKey();
		int result = 0;

		try {
			ConnectionToMySQL connect = new ConnectionToMySQL();
			Connection connection = connect.connectToDatabase();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into specimen \r\n"
							+ "(Specimen_storing_ID, Extra_infos, Measurement_type, Image, Image_timestamp, Image_description, \r\n "
							+ "Image_copyright, Host, Sex, Life_stage, Reproduction, Collection_method_name,\r\n"
							+ "Taxonomic_method_name, Taxonomic_timestamp, Collection_timestamp, Taxonomy, \r\n"
							+ " Collection_area, Collection_elevation, Collection_GPS)\r\n"
							+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,\r\n"
							+ " ?, ?, ?, ?, POINT(?,?))");
			preparedStatement.setString(1, key);
			preparedStatement.setString(2, specimenBean.getExtraInfos());
			preparedStatement.setString(3, specimenBean.getMeasurementType());
			preparedStatement.setString(4, specimenBean.getImage());
			preparedStatement.setString(5, specimenBean.getImageTimestamp());
			preparedStatement.setString(6, specimenBean.getImageDescription());
			preparedStatement.setString(7, specimenBean.getImageCopyright());
			preparedStatement.setString(8, specimenBean.getHost());
			preparedStatement.setString(9, specimenBean.getSex());
			preparedStatement.setString(10, specimenBean.getLifeStage());
			preparedStatement.setString(11, specimenBean.getReproduction());
			preparedStatement.setString(12, specimenBean.getCollectionMethodName());
			preparedStatement.setString(13, specimenBean.getTaxonomicMethodName());
			preparedStatement.setString(14, specimenBean.getTaxonomicTimestamp());
			preparedStatement.setString(15, specimenBean.getCollectionTimestamp());
			preparedStatement.setString(16, specimenBean.getCollectionTaxonomy());
			preparedStatement.setString(17, specimenBean.getCollectionArea());
			preparedStatement.setString(18, specimenBean.getCollectionElevation());
			preparedStatement.setString(19, specimenBean.getCollectionGPSX());
			preparedStatement.setString(20, specimenBean.getCollectionGPSY());


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
