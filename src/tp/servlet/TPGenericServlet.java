package tp.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.util.HttpUtil;

public abstract class TPGenericServlet extends HttpServlet {
	private static final long serialVersionUID = 6087357305372546149L;

	@Override
	protected final void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		process(req, resp);
	}
	
	@Override
	protected final void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
		process(req, resp);
	}
	
	protected abstract void process (HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException;
	
	protected void paramListener (HttpServletRequest req) {
		HttpUtil.logParameters(req);
	}
}
