package methods;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import methods.MethodBean.Types;

/**
 * Servlet implementation class MethodServlet
 */
@WebServlet("/addMethod")
public class MethodServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private MethodDao methodDao;
	
	public void init() {
		methodDao = new MethodDao();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MethodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodDescription = request.getParameter("methodDescription");
		String methodTypeString = request.getParameter("methodType");
		Types methodType = null;
		
		try {
			methodType = Types.valueOf(methodTypeString);
		}catch (Exception e) {
			response.sendRedirect("addMethod.jsp");
			return;
		}
		MethodBean methodBean = new MethodBean();
		methodBean.setMethodDescription(methodDescription);
		methodBean.setMethodType(methodType);
		try {
			if(methodDao.registerMethod(methodBean)!=0) {
				response.sendRedirect("validatedMethod.jsp");
			}else {
				response.sendRedirect("addMethod.jsp");
			}
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
