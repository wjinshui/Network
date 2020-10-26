package class12;

public class DotnetTeacher extends Teacher
{

	public DotnetTeacher(String name, String degree)
	{
		super(name, degree);		
	}
	
	void intro()
	{
		System.out.println("I am a dotnet teacher, name: " + name + "; degree: " + degree);
	}
	
	void teach()
	{
		System.out.println("programming by dotnet");
	}

}
