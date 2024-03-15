package student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dto {

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
@Id
	private long Register_no;
	private String Student_name;
	private String Date_of_Birth;
	private String Father_name;
	private int Kannada;
	private int English;
	private int Hindi;
	private int Mathamatics;
	private int Science;
	private int Social_Science;
	private int Total_marks;
	private Float Percentage;
	private String Result;
	private String kGrade;
	private String eGrade;
	private String hGrade;
	private String mGrade;
	private String sGrade;
	private String ssGrade;
	private String CPA;
	
	
	public String getCPA() {
		return CPA;
	}
	public void setCPA(String cPA) {
		CPA = cPA;
	}
	public String getkGrade() {
		return kGrade;
	}
	public void setkGrade(String kGrade) {
		this.kGrade = kGrade;
	}
	public String geteGrade() {
		return eGrade;
	}
	public void seteGrade(String eGrade) {
		this.eGrade = eGrade;
	}
	public String gethGrade() {
		return hGrade;
	}
	public void sethGrade(String hGrade) {
		this.hGrade = hGrade;
	}
	public String getmGrade() {
		return mGrade;
	}
	public void setmGrade(String mGrade) {
		this.mGrade = mGrade;
	}
	public String getsGrade() {
		return sGrade;
	}
	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}
	public String getSsGrade() {
		return ssGrade;
	}
	public void setSsGrade(String ssGrade) {
		this.ssGrade = ssGrade;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	
	public long getRegister_no() {
		return Register_no;
	}
	public void setRegister_no(long register_no) {
		Register_no = register_no;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getKannada() {
		return Kannada;
	}
	public void setKannada(int kannada) {
		Kannada = kannada;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getMathamatics() {
		return Mathamatics;
	}
	public Float getPercentage() {
		return Percentage;
	}
	public void setPercentage(Float percentage) {
		Percentage = percentage;
	}
	public void setMathamatics(int mathamatics) {
		Mathamatics = mathamatics;
	}
	public int getScience() {
		return Science;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocial_Science() {
		return Social_Science;
	}
	public void setSocial_Science(int social_Science) {
		Social_Science = social_Science;
	}
	
	
}
