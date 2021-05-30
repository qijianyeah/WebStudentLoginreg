
package scoremessage;

import java.util.List;
import mode.GradeBean;
import forms.GradeFrom;
import scoredao.GradeDaoImpl;

/**
 * 成绩处理业务类-单例模式
 * @author Administrator
 *
 */

public class ScoreMessage {

	static private ScoreMessage instance=null;

	private ScoreMessage()
	{}

	static public ScoreMessage getInstance()
	{
		if(instance==null)
		{
			instance=new ScoreMessage();

		}
		return instance;
	}

	/**
	 *查找所有用户成绩
	 * @param null
	 * @param List
	 */
	public List findAllScore()
	{
		GradeDaoImpl daoImpl=new GradeDaoImpl();
		List allGread=daoImpl.findAllGread();
		return allGread;
	}

	/**
	 *查找所有学生id
	 * @param null
	 * @param List
	 */
	public List findAllStudentId()
	{   GradeDaoImpl daoImpl=new GradeDaoImpl();
		List allStudentId=daoImpl.findAllStudentId();
		return allStudentId;
	}

	/**
	 * 查找所有课程id
	 * @param null
	 * @param List
	 */
	public List findAllClassId()
	{   GradeDaoImpl daoImpl=new GradeDaoImpl();
		List allClassId=daoImpl.findAllClassId();
		return allClassId;
	}

	public void addGrade(GradeFrom gradeFrom)
	{   GradeDaoImpl daoImpl=new GradeDaoImpl();
		daoImpl.addGrade(gradeFrom);
	}

	/**
	 * 通过id查找成绩
	 * @param 成绩标识
	 * @return GradeBean
	 */
	public GradeBean findGradeById(int id)
	{
		GradeBean gradeBean=null;
		GradeDaoImpl daoImpl=new GradeDaoImpl();
		gradeBean=daoImpl.findGradeById(id);
		return gradeBean;
	}

	/**
	 * 通过id更新学生成绩
	 * @param 成绩标识、学生成绩
	 * @return null
	 */
	public void updateGrade(int id,String grade){
		GradeDaoImpl daoImpl=new GradeDaoImpl();
		daoImpl.updateGrade(id, grade);
	}

	/**
	 * 通过id删除学生成绩
	 * @param 成绩标识
	 * @return null
	 */
	public void StudentGradeDel(int id)
	{ GradeDaoImpl daoImpl=new GradeDaoImpl();
		daoImpl.StudentGradeDel(id);
	}

}

