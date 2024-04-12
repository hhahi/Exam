package dao;

import java.sql.ResultSet;

import bean.School;
import bean.Student;


public class StudentDao extends Dao {

	private String baseSql = "select * from student where school_cd=? ";

	public Student get(String no) throws Exception {

	}

	private List<Student> postFilter(ResultSet rSet, School school) throws Exception {

	}

	public List<student> filter(School school, int entYear, String classNum, boolean isAttend) throws Exception {

	}

	public List<student> filter(School school, int entYear, boolean isAttend) throws Exception {

	}

	List<student> filter(School school, boolean isAttend) throws Exception {
		
	}

	public boolean save(Student student) throws Exception {

	}
	

}