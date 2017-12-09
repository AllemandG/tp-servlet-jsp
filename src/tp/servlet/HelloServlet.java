package tp.servlet;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/hello")
public class HelloServlet extends TPGenericServlet {
	
	private static final long serialVersionUID = 4023442997406361930L;
	
	protected void process (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		resp.getOutputStream().print("Hello get or post ! " + new Date());
	}
	
}
