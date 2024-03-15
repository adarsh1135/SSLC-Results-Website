package student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update")
public class upcontrol extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String no=req.getParameter("regno");
		long regno=Long.parseLong(no);
		String name=req.getParameter("name");
		String dob = req.getParameter("dob");
		String fname=req.getParameter("fname");
		String kk=req.getParameter("kan");
		int kan=Integer.parseInt(kk);
		String ee=req.getParameter("eng");
		int eng=Integer.parseInt(ee);
		String hh=req.getParameter("hin");
		int hin=Integer.parseInt(hh);
		String mm=req.getParameter("math");
		int math=Integer.parseInt(mm);
		String s=req.getParameter("scien");
		int scien=Integer.parseInt(s);
		String ss=req.getParameter("ss");
		int sscien=Integer.parseInt(ss);
		int tmark=(kan+eng+hin+math+scien+sscien);
		float per=(tmark*100/625);
		String kgrade=kkgrade(kan);
		String egrade=eegrade(eng);
		String hgrade=hhgrade(hin);
		String mgrade=mmgrade(math);
		String sgrade=scgrade(scien);
		String ssgrade=sscgrade(sscien);
		String cga=grade(tmark);
		String result=results(kgrade,egrade,hgrade,mgrade,sgrade,ssgrade);
		
		dto dto=new dto();
		dto.setRegister_no(regno);
		dto.setStudent_name(name);
		dto.setDate_of_Birth(dob);
		dto.setFather_name(fname);
		dto.setKannada(kan);
		dto.setEnglish(eng);
		dto.setHindi(hin);
		dto.setMathamatics(math);
		dto.setScience(scien);
		dto.setSocial_Science(sscien);
		dto.setTotal_marks(tmark);
		dto.setPercentage(per);
		dto.setkGrade(kgrade);
		dto.seteGrade(egrade);
		dto.sethGrade(hgrade);
		dto.setmGrade(mgrade);
		dto.setsGrade(sgrade);
		dto.setSsGrade(ssgrade);
		dto.setCPA(cga);
		dto.setResult(result);
		
		dao dao=new dao();
		dao.update(dto);
		student.dto l=dao.fetch(regno);
		
		req.setAttribute("sslist", l);
		
		resp.getWriter().print("<h1>Data Updated Successfully</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("down.jsp");
		rd.include(req, resp);
	}
	
	private String results(String kgrade, String egrade, String hgrade, String mgrade, String sgrade, String ssgrade) {
		// TODO Auto-generated method stub
		if(kgrade!="F" && egrade!="F" && hgrade!="F" && mgrade!="F" && sgrade!="F" && ssgrade!="F")
			return "Pass";
		else
			return "Fail";
	}

	private String grade(int tmark) {
		// TODO Auto-generated method stub
		if(tmark>=563)
			return "A+";
		else if(tmark>=500 && tmark<=562)
			return "A";
		else if(tmark>=438 && tmark<=499)
			return "B+";
		else if(tmark>=375 && tmark<=437)
			return "B";
		else if(tmark>=313 && tmark<=374)
			return "C+";
		else if(tmark>=219 && tmark<=312)
			return "C";
		else 
			return "F";
	}

	private String sscgrade(int sscien) {
		// TODO Auto-generated method stub
		if(sscien>=90)
			return "A+";
		else if(sscien>=80 && sscien<=89)
			return "A";
		else if(sscien>=70 && sscien<=79)
			return "B+";
		else if(sscien>=60 && sscien<=69)
			return "B";
		else if(sscien>=50 && sscien<=59)
			return "C+";
		else if(sscien>=35 && sscien<=49)
			return "C";
		else 
			return "F";
	}

	private String scgrade(int scien) {
		// TODO Auto-generated method stub
		if(scien>=90)
			return "A+";
		else if(scien>=80 && scien<=89)
			return "A";
		else if(scien>=70 && scien<=79)
			return "B+";
		else if(scien>=60 && scien<=69)
			return "B";
		else if(scien>=50 && scien<=59)
			return "C+";
		else if(scien>=35 && scien<=49)
			return "C";
		else 
			return "F";
	}

	private String mmgrade(int math) {
		// TODO Auto-generated method stub
		if(math>=90)
			return "A+";
		else if(math>=80 && math<=89)
			return "A";
		else if(math>=70 && math<=79)
			return "B+";
		else if(math>=60 && math<=69)
			return "B";
		else if(math>=50 && math<=59)
			return "C+";
		else if(math>=35 && math<=49)
			return "C";
		else 
			return "F";
	}

	private String hhgrade(int hin) {
		// TODO Auto-generated method stub
		if(hin>=90)
			return "A+";
		else if(hin>=80 && hin<=89)
			return "A";
		else if(hin>=70 && hin<=79)
			return "B+";
		else if(hin>=60 && hin<=69)
			return "B";
		else if(hin>=50 && hin<=59)
			return "C+";
		else if(hin>=35 && hin<=49)
			return "C";
		else 
			return "F";
	}

	private String eegrade(int eng) {
		// TODO Auto-generated method stub
		if(eng>=90)
			return "A+";
		else if(eng>=80 && eng<=89)
			return "A";
		else if(eng>=70 && eng<=79)
			return "B+";
		else if(eng>=60 && eng<=69)
			return "B";
		else if(eng>=50 && eng<=59)
			return "C+";
		else if(eng>=35 && eng<=49)
			return "C";
		else 
			return "F";
	}

	private String kkgrade(int kan) {
		// TODO Auto-generated method stub
		if(kan>=113)
			return "A+";
		else if(kan>=100 && kan<=112)
			return "A";
		else if(kan>=88 && kan<=99)
			return "B+";
		else if(kan>=75 && kan<=87)
			return "B";
		else if(kan>=63 && kan<=74)
			return "C+";
		else if(kan>=44 && kan<=62)
			return "C";
		else 
			return "F";
	}

}
