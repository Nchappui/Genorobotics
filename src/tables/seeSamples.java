package tables;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionToMySQL;
import sample.SampleBean;

/**
 * Servlet implementation class seeSamples
 */
@WebServlet("/seeSamples")
public class seeSamples extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{ 
		response.setContentType("text/html;charset=UTF-8");
		ResultSet result = null ;
		Connection connection=null;
		ArrayList<SampleBean> std = new ArrayList<SampleBean>();

		try {
			ConnectionToMySQL connect = new ConnectionToMySQL();
			connection = connect.connectToDatabase();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM genorobotics.sample;");
			result = ps.executeQuery();
			while(result.next()) {
				SampleBean sample = new SampleBean();
				sample.setSampleID(result.getString(1));
				sample.setStoringLocation(result.getString(2));
				sample.setSampleSequencer(result.getString(3));
				sample.setSampleStocker(result.getString(4));
				sample.setSampleUploader(result.getString(5));
				sample.setSampleIdentifier(result.getString(6));
				sample.setSampleCollector(result.getString(7));
				sample.setSampleExtractor(result.getString(8));
				sample.setSampleAmplifier(result.getString(9));
				sample.setSequencingMethodName(result.getString(10));
				sample.setAmplificationMethodName(result.getString(11));
				sample.setExtractionMethodName(result.getString(12));
				sample.setSpecimenStoringID(result.getString(13));
				sample.setSequencingTimestamp(result.getString(14));
				sample.setAmplificationTimestamp(result.getString(15));
				sample.setExtractionTimestamp(result.getString(16));
				sample.setPrimerCodes(result.getString(17));
				sample.setReadDirection(result.getString(18));
				sample.setSequenceLength(result.getString(19));
				sample.setMarker(result.getString(20));
				sample.setPrimerDescription(result.getString(21));
				sample.setSequenceData(result.getString(22));
				sample.setBaseCallingFile(result.getString(23));
				std.add(sample);
			}
		}

		// Step 2:Create a statement using connection object
		catch (Exception e) {
			// process sql exception
			e.printStackTrace();
		}
		request.setAttribute("samplesData", std);
		RequestDispatcher rd = request.getRequestDispatcher("seeSamples.jsp");
		rd.forward(request, response); 


	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response); 
	}

}
