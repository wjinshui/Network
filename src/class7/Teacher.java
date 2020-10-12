package class7;

public class Teacher
{
	String name;
	private int age = 18;
	
	void dispInfo()
	{
		System.out.println("姓名： " + name + "; 年龄： " + age);
	}
	
	void setAge(int m_age)
	{
		if(m_age < 18)
		{
			System.out.println("年龄太小");
			m_age = 18;
		}
		age = m_age;
	}
	
	int getAge()
	{
		return age;
	}
	
}
