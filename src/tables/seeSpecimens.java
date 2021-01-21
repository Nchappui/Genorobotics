package tables;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import specimen.SpecimenBean;
import specimen.SpecimenBean.LifeStages;
import specimen.SpecimenBean.ReproductionTypes;
import specimen.SpecimenBean.Sexes;

/**
 * Servlet implementation class seeSpecimens
 */
@WebServlet("/seeSpecimens")
public class seeSpecimens extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{ 
		response.setContentType("text/html;charset=UTF-8");
		ResultSet result = null ;
		Connection connection=null;
		ArrayList<SpecimenBean> std = new ArrayList<SpecimenBean>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM genorobotics.specimen;");
			result = ps.executeQuery();
			while(result.next()) {
				SpecimenBean specimen = new SpecimenBean();
				specimen.setSpecimenID(result.getString(1));
				specimen.setExtraInfos(result.getString(2));
				specimen.setMeasurementType(result.getString(3));
				specimen.setImage(result.getString(4));
				specimen.setImageTimestamp(result.getString(5));
				specimen.setImageDescription(result.getString(6));
				specimen.setImageCopyright(result.getString(7));
				specimen.setHost(result.getString(8));
				specimen.setSex(Sexes.valueOf(result.getString(9)));
				specimen.setLifeStage(LifeStages.valueOf(result.getString(10)));
				specimen.setReproduction(ReproductionTypes.valueOf(result.getString(11)));
				specimen.setCollectionMethodName(result.getString(12));
				specimen.setTaxonomicMethodName(result.getString(13));
				specimen.setTaxonomicTimestamp(result.getString(14));
				specimen.setCollectionTimestamp(result.getString(15));
				specimen.setCollectionTaxonomy(result.getString(16));
				specimen.setCollectionArea(result.getString(17));
				specimen.setCollectionElevation(result.getString(18));
				specimen.setCollectionGPSX(result.getString(19));
				specimen.setCollectionGPSY(result.getString(19));
			
				std.add(specimen);
			}
		}

            // Step 2:Create a statement using connection object
        	catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
		request.setAttribute("specimensData", std);
		RequestDispatcher rd = request.getRequestDispatcher("seeSpecimens.jsp");
		rd.forward(request, response); 
      
		 
	}
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response); 
	}

}
