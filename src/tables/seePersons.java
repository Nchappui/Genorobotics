package tables;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public seePersons() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{ 
		System.out.println("went here in see persons");
		response.setContentType("text/html;charset=UTF-8"); 
		try (PrintWriter out = response.getWriter()) { 
			out.println("<!DOCTYPE html>"); 
			out.println("<html>"); 
			out.println("<head>"); 
			out.println("<title>Servlet StudentServlet</title>"); 
			out.println("</head>"); 
			out.println("<body>"); 

			// List to hold Student objects 
			ArrayList<Student> std = new ArrayList<Student>(); 

			// Adding members to the list. Here we are  
			// using the parameterized constructor of  
			// class "Student.java" 
			std.add(new Student("Roxy Willard", 22, "B.D.S")); 
			std.add(new Student("Todd Lanz", 22, "B.Tech")); 
			std.add(new Student("Varlene Lade", 21, "B.B.A")); 
			std.add(new Student("Julio Fairley", 22, "B.Tech")); 
			std.add(new Student("Helena Carlow", 24, "M.B.B.S")); 

			// Setting the attribute of the request object 
			// which will be later fetched by a JSP page 
			request.setAttribute("data", std); 

			// Creating a RequestDispatcher object to dispatch 
			// the request the request to another resource 
			RequestDispatcher rd =  
					request.getRequestDispatcher("seePersons.jsp"); 

			// The request will be forwarded to the resource  
			// specified, here the resource is a JSP named, 
			// "stdlist.jsp" 
			rd.forward(request, response); 
			out.println("</body>"); 
			out.println("</html>"); 
		} 
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
