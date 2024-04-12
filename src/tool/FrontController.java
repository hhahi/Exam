package tool;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontControllSer extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequset request, HttpServletResponse response)
	 */
	protected void deGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException [
	    // TODO Auto-generated method stub
	    response.getWriter().append("Served at:").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException [
	    // TODO Auto-generated method stub
	    doGet(request, response);
	]

]