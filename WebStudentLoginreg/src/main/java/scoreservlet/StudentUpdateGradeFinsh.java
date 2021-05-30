
  package scoreservlet;

  import java.io.IOException;
  import javax.servlet.RequestDispatcher;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import scoremessage.ScoreMessage;
  
  /**
   * 
   * @author Administrator
   *  完成更新学生成绩请求控制-更新成绩
   */

  @WebServlet(urlPatterns = "/StudentUpdateGradeFinsh")
  public class StudentUpdateGradeFinsh extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		String grade=req.getParameter("grade");
		
		ScoreMessage scoreMassage=ScoreMessage.getInstance();
		scoreMassage.updateGrade(id,grade);
//		RequestDispatcher
		req.getRequestDispatcher("/StudentgradeInfo").forward(req, resp);
	}
	
  }
