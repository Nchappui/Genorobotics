package tables;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persons.PersonBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seePersons
 */
@WebServlet("/seePersons")
public class seePersons extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void processRequest(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{ 
		response.setContentType("text/html;charset=UTF-8");
		ResultSet result = null ;
		Connection connection=null;
		ArrayList<PersonBean> std = new ArrayList<PersonBean>();
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
				PersonBean person = new PersonBean();
				person.setEmail(result.getString(1));
				person.setFullname(result.getString(2));			
				std.add(person);
			}
		}

            // Step 2:Create a statement using connection object
        	catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
		request.setAttribute("personsData", std);
		RequestDispatcher rd = request.getRequestDispatcher("seePersons.jsp");
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
