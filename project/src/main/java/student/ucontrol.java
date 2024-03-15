package student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchdata")
public class ucontrol extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String no=req.getParameter("regno");
		long regno=Long.parseLong(no);
		
		dao dao=new dao();
		dto	l=dao.fetch(regno);
		
		req.setAttribute("sslist", l);
		
		RequestDispatcher rd=req.getRequestDispatcher("down.jsp");
		rd.include(req, resp);
	}

}
