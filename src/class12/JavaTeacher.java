package class12;

public class JavaTeacher extends Teacher
{

	public JavaTeacher(String name, String degree)
	{
		super(name, degree);
		// TODO Auto-generated constructor stub
	}
	
	void intro()
	{
		System.out.println("I am a java teacher, name: " + name + "; degree: " + degree);
	}
	
	void teach()
	{
		System.out.println("programming by java");
	}

}
