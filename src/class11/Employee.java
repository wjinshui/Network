package class11;

public class Employee
{
	String gender, id, name; 	
	double salary;
	private double weight;
	
	public Employee()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String id, String name)
	{
		
		this.id = id;
		this.name = name;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	

	void showInfo()
	{
		System.out.print("\n name: " + name + "; id: " + id + "; salary: " + salary + "; gender: " + gender);
	}
}
