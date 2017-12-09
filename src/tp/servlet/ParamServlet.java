package tp.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/testparam1")
public class ParamServlet extends TPGenericServlet {
	private static final long serialVersionUID = 3775239323810528831L;

	protected void process (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		paramListener(req);
	}
}
