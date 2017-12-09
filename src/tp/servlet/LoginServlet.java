package tp.servlet;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.user.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/public/login")
public class LoginServlet extends TPGenericServlet {
	private static final long serialVersionUID = -8022909715468714494L;
	
	protected void process (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		if ("pwd".equals(req.getParameter("passw"))) {
			req.getSession().setAttribute("USER", new UserBean(req.getParameter("login"), new Date()));
			req.getSession().setAttribute("connected", true);
			resp.sendRedirect("../private/home.jsp");
		} else {
			req.getSession().setAttribute("loginTry", true);
			if (req.getSession().getAttribute("USER") != null) {
				req.getSession().removeAttribute("USER");
			}
			resp.sendRedirect("../public/login.jsp");
		}
	}
}
