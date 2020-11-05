package class16;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int a = 10, b = 0, c;
		
	    //这里的除数为0，将会产生异常
		try
		{
			c = a / b;
			System.out.println("**********************");
		} catch (Exception e)
		{
			System.out.println("出现异常了。。。");
		}
		
		System.out.println("我在这里");
	    
	    


	}

}
