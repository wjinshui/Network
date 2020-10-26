package class9;

public class DogTest
{

	int c1 ;
	static int c2 =1;
	public void test1()
	{
		Dog.test1();
	}
	
	static void test2()
	{
		
	}
	
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		
		System.out.println(Dog.count);
		
		Dog dog2 = new Dog();
		System.out.println(dog1.count);	
		for (int i = 0; i < 10; i++)
		{
			new Dog();
			
		}
		System.out.println(dog1.count);
		
		

	}

}
