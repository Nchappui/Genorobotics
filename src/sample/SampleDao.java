package sample;

import java.sql.Connection;
import utils.KeyGenerator;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionToMySQL;

/**
 * Generates and the query and executes it
 * 
 * @author Nolan
 *
 */

public class SampleDao {

	public int registerSample(SampleBean sampleBean) throws ClassNotFoundException {
		KeyGenerator kg = new KeyGenerator();
		String key= kg.GenerateKey();
		int result = 0;

		try {
			ConnectionToMySQL connect = new ConnectionToMySQL();
			Connection connection = connect.connectToDatabase();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into sample \r\n"
							+ "(Sample_Id, Storing_location, Sample_sequencer, Sample_stocker, Sample_uploader, Sample_identifier, \r\n "
							+ "Sample_collector, Sample_extractor, Sample_amplifier, Sequencing_method_name, Amplification_method_name, Extraction_method_name, Specimen_storing_ID,\r\n"
							+ "Sequencing_timestamp, Amplification_timestamp, Extraction_timestamp, Primer_codes, \r\n"
							+ " Read_direction, Sequence_length, Marker, Primer_description, Sequence_data, Base_calling_file)\r\n"
							+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,\r\n"
							+ " ?, ?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, key);
			preparedStatement.setString(2, sampleBean.getStoringLocation());
			preparedStatement.setString(3, sampleBean.getSampleSequencer());
			preparedStatement.setString(4, sampleBean.getSampleStocker());
			preparedStatement.setString(5, sampleBean.getSampleUploader());
			preparedStatement.setString(6, sampleBean.getSampleIdentifier());
			preparedStatement.setString(7, sampleBean.getSampleCollector());
			preparedStatement.setString(8, sampleBean.getSampleExtractor());
			preparedStatement.setString(9, sampleBean.getSampleAmplifier());
			preparedStatement.setString(10, sampleBean.getSequencingMethodName());
			preparedStatement.setString(11, sampleBean.getAmplificationMethodName());
			preparedStatement.setString(12, sampleBean.getExtractionMethodName());
			preparedStatement.setString(13, sampleBean.getSpecimenStoringID());
			preparedStatement.setString(14, sampleBean.getSequencingTimestamp());
			preparedStatement.setString(15, sampleBean.getAmplificationTimestamp());
			preparedStatement.setString(16, sampleBean.getExtractionTimestamp());
			preparedStatement.setString(17, sampleBean.getPrimerCodes());
			preparedStatement.setString(18, sampleBean.getReadDirection());
			preparedStatement.setString(19, sampleBean.getSequenceLength());
			preparedStatement.setString(20, sampleBean.getMarker());
			preparedStatement.setString(21, sampleBean.getPrimerDescription());
			preparedStatement.setString(22, sampleBean.getSequenceData());
			preparedStatement.setString(23, sampleBean.getBaseCallingFile());


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
