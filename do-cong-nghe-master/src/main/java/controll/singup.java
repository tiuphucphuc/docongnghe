package controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.daouser;

/**
 * Servlet implementation class singup
 */
@WebServlet("/singup")
public class singup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public singup() {
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
		
		String name = request.getParameter("username");
		 String password = request.getParameter("password");
		 String email = request.getParameter("email");
		
		
		 
		
		 boolean a = daouser.insert(name, password,email);
		 
		 if(a) {
			 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			 
		 rd.forward(request, response);
		 }else {
			 	RequestDispatcher rd = request.getRequestDispatcher("singup.jsp");
			 
			 rd.forward(request, response);
		 }
	}

}
