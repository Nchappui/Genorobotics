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
import methods.MethodBean;
import methods.MethodBean.Types;

/**
 * Servlet implementation class seeMethods
 */
@WebServlet("/seeMethods")
public class seeMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{ 
		response.setContentType("text/html;charset=UTF-8");
		ResultSet result = null ;
		Connection connection=null;
		ArrayList<MethodBean> std = new ArrayList<MethodBean>();
		
		
		try {
			ConnectionToMySQL connect = new ConnectionToMySQL();
			connection = connect.connectToDatabase();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM genorobotics.methods;");
			result = ps.executeQuery();
			while(result.next()) {
				MethodBean method = new MethodBean();
				method.setMethodName(result.getString(1));
				method.setMethodDescription(result.getString(2));
				method.setMethodType(Types.valueOf(result.getString(3)));
				std.add(method);
			}
		}

		// Step 2:Create a statement using connection object
		catch (Exception e) {
			// process sql exception
			e.printStackTrace();
		}
		request.setAttribute("methodsData", std);
		RequestDispatcher rd = request.getRequestDispatcher("seeMethods.jsp");
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
