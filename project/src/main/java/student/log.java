package student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class log extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String no = req.getParameter("regno");
		long regno = Long.parseLong(no);
		String dob = req.getParameter("dob");

		dao dao = new dao();
		dto e1 = dao.login(regno);
		if (e1 != null) {
			if (e1.getDate_of_Birth().equals(dob)) {
				req.setAttribute("result", e1);
				RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
				dispatcher.forward(req, resp);
			} else {
				resp.getWriter().print("<h1>enter correct DOB</h1>");
			}
		} else {
			resp.getWriter().print("<h1>Invalid reg_no</h1>");
		}
	}
}
