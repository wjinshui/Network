import java.util.ArrayList;

public class Student
{
	String name;
	String no;
	int age;
	ArrayList courses = new ArrayList();
	
	public void dispInfo()
	{
		System.out.println("姓名： " + name + "; 学号: " +  no + "; 年龄： " + age + "; 所选课程： " );

		for (Object course : courses)
		{
			System.out.print(course + " ");
			
		}
		
	}
	
	public void choiceCourse(String name)
	{
		courses.add(name);
	}
	
	public void quitCourse(String name)
	{
		courses.remove(name);
	}
	
	
}
