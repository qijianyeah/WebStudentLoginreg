 
  package scoreservlet;

  import java.io.IOException;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import scoremessage.ScoreMessage;
  import forms.GradeFrom;

  /**
   * 
   * @author Administrator
   * 完成学生成绩插入请求控制
   */
  @WebServlet(urlPatterns = "/StudentAddGradeFinsh")
  public class StudentGradeAddFinsh extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		int studentId = Integer.parseInt(req.getParameter("studentId"));
		int classId=Integer.parseInt(req.getParameter("classId"));
		String grade=req.getParameter("grade");
		
		GradeFrom gradeFrom=new GradeFrom();
		gradeFrom.setClassId(classId);
		gradeFrom.setStudentId(studentId);
		gradeFrom.setGrade(grade);
		
		ScoreMessage scoreMassage=ScoreMessage.getInstance();
		scoreMassage.addGrade(gradeFrom);
		
		req.getRequestDispatcher("/StudentgradeInfo").forward(req, resp);
		 
	}

 }
