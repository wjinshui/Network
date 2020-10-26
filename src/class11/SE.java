package class11;

public class SE extends Employee
{
	
	int hot;
	
	public SE()
	{
		super("S0001", "Lishi");
	}
	
	
	public int getHot()
	{
		return hot;
	}
	public void setHot(int hot)
	{
		this.hot = hot;
	}
	
	void showInfo()
	{
		super.showInfo();
		System.out.print("; hot: " + hot );
	}
	
	
}
