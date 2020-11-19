package exam;

import java.util.Scanner;

public class Q1
{

	public static void main(String[] args)
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int num_odd = 0, num_even = 0;
		for (int i = 0; i < n; i++)
		{
			int num = scanner.nextInt();
			if(num % 2 == 0)
				num_even ++;
			else {
				num_odd ++;
			}
		}
		System.out.println(num_odd + " " + num_even);

	}

}
