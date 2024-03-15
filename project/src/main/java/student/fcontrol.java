package student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchall")
public class fcontrol extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		dao ss=new dao();
		List<dto> list=ss.fetchall();
		
		req.setAttribute("slist", list);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("fetch.jsp");
		dispatcher.forward(req, resp);
	}

}
 