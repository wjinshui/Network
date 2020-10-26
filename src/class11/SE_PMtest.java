package class11;

public class SE_PMtest extends PM
{
	public void test()
	{
		
	}

	public static void main(String[] args)
	{
		SE se = new SE();
		se.setId("S0001");
		se.setName("zhangsan");
		se.setGender("male");
		se.showInfo();
		
		PM pm = new PM();		
		pm.setId("P0001");
		pm.setName("lishi");
		pm.setGender("female");
		pm.setExp(1.3);
		pm.showInfo();

	}

}
