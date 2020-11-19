package class16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args)
	{

		test2();
		System.out.println("*************************");

	}

	static void test2() 
	{
		
		try
		{
			test();
		} catch (WeightException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test() throws WeightException
	{
		Scanner scanner = new Scanner(System.in);
		double weight;
		System.out.println("请输入您的体重");
		weight = scanner.nextDouble();

		if (weight > 110)
			throw new WeightException();

		System.out.println("您的体重是 " + weight);
	}

}
