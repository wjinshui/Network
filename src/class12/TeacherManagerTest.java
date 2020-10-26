package class12;

public class TeacherManagerTest
{

	public static void main(String[] args)
	{
		TeacherManager tm = new TeacherManager();
		JavaTeacher zhangsan = new JavaTeacher("zhangsan", "doctor");
		DotnetTeacher lishi = new DotnetTeacher("lishi", "doctor");
		DBTeacher wangwu = new DBTeacher("wangwu", "master");
		tm.judge(zhangsan);
		tm.judge(lishi);
		tm.judge(wangwu);

	}

}
