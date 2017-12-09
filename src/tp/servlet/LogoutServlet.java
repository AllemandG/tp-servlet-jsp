package tp.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/private/logout")
public class LogoutServlet extends TPGenericServlet {
	private static final long serialVersionUID = 7302425939986990848L;
	
	protected void process (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		req.getSession().invalidate();
		resp.sendRedirect("../public/login.jsp");
	}
}
