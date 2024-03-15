package student;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/delete")
public class dcontrol extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no=req.getParameter("regno");
		long regno=Long.parseLong(no);

		dao dao=new dao();
		String msg=dao.delete(regno);
		res.getWriter().print(msg);
	}

}
