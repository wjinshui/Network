package class11;

public class PM extends Employee
{	
	public double exp;
	private double  bonus;
	
	public PM()
	{		
		super("0001", "zhangsan");	
		
	}
	
	PM(double exp)
	{
		
	}
	
	PM(String eee)
	{
		this(0.001);
	}
	
	
	
	public  double getExp()
	{
		
		return exp;
	}

	public void setExp(double exp)
	{
		this.exp = exp;
	}

	public double getBonus()
	{
		return bonus;
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	void showInfo()
	{
		super.showInfo();
		System.out.print("; bonus: " + bonus + "; exp: " + exp);
	}
}
