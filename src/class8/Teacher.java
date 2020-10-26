package class8;

public class Teacher
{
	private int age;
	private String name, degree, position;
	
	
	
	public Teacher(int age, String name, String degree)
	{
		super();
		this.age = age;
		this.name = name;
		this.degree = degree;
	}

	public Teacher(int age, String name, String degree, String position)
	{
		super();
		this.age = age;
		this.name = name;
		this.degree = degree;
		this.position = position;
	}

	Teacher(String m_name, int m_age)
	{
		name = m_name;
		age = m_age;
	}
	
	void showInfo()
	{
		System.out.println("Name: " + name + "; degree: " + degree + "; age: " + age + "; position: " + position);
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDegree()
	{
		return this.degree;
	}
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	
}
