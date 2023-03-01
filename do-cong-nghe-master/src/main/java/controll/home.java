package controll;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.daouser;
import bean.user;


@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
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
		 
		 user us = daouser.get(name, password);
		 
		 if(us != null) {
			 if(us.getId_admin()==1) {
				 RequestDispatcher rd = request.getRequestDispatcher("./admin/index.jsp");
				 
					HttpSession session = request.getSession();
					
					session.setAttribute("name", name);
					
				 rd.forward(request, response);
			 }else {
				 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				 
					HttpSession session = request.getSession();
					
					session.setAttribute("name", name);
					
				 rd.forward(request, response);
			 }
			
		 }
			 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			 
			
			
			 rd.forward(request, response);
		
	}

}
