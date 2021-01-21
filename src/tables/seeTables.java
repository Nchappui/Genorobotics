package tables;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seeTables
 */
@WebServlet("/seeTables")
public class seeTables extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public seeTables() {
    	
        super();
        System.out.println("went here in see tables1");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResultSet result = null ;
		Connection connection=null;
		String resultString="Email					Name" + "\n";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/genorobotics?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true", "root", "test");
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM genorobotics.person;");
			result = ps.executeQuery();
			while(result.next()) {
				resultString = resultString + result.getString(1) + "					"+ result.getString(2)+"\n";
			}
		}

            // Step 2:Create a statement using connection object
        	catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
       
		response.getWriter().append(resultString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("went here in see tables");
		doGet(request, response);
	}

}
