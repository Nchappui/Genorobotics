package persons;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/addperson")
public class PersonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonDao personDao;

	public void init() {
		personDao = new PersonDao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String fullname = request.getParameter("fullname");
		PersonBean personBean = new PersonBean();
		personBean.setEmail(email);
		personBean.setFullname(fullname);

		try {
			if(personDao.registerPerson(personBean)!=0) {
				response.sendRedirect("validatedperson.jsp");
			} else {
				response.sendRedirect("addperson.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
