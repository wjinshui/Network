import java.util.Random;
import java.util.Scanner;

public class GuessDemo
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Levels: 1(Easy), 2 (Noraml), 3(Hard)");
		System.out.println("Select Level:");
		int choice = scanner.nextInt();
		int maxTry = 0;
		switch (choice)
		{
		case 1:
			maxTry = 12;
			break;
		case 2:
			maxTry = 9;
			break;
		default:
			maxTry = 7;
		}

		int num_count = 4;
		int[] answers = new int[num_count];
		boolean[] flags = new boolean[10];
		Random random = new Random();

		for (int i = 0; i < answers.length; i++)
		{
			while (true)
			{
				int num = random.nextInt(10);
				if (flags[num] == false)
				{
					answers[i] = num;
					flags[num] = true;
					break;
				}
			}
		}

		System.out.println("数字准备完毕！");
		int cnt = 1;
		while (true)
		{
			System.out.println("" + cnt + ": 请输入4个数字（0-9");
			int[] inputs = new int[num_count];
			for (int i = 0; i < inputs.length; i++)
			{
				inputs[i] = scanner.nextInt();
			}
			int a = 0, b = 0, c = 0;
			for (int i = 0; i < answers.length; i++)
			{
				for (int j = 0; j < inputs.length; j++)
				{
					if (answers[i] == inputs[j])
						c++;
				}
			}
			for (int i = 0; i < inputs.length; i++)
			{
				if (answers[i] == inputs[i])
					a++;
			}
			b = c - a;
			System.out.println("" + a + "A" + b + "B");
			if(a == num_count)
			{
				System.out.println("你好厉害啊！！！");
				break;
			}
			if(cnt> maxTry)
			{
				System.out.println("你好挫啊！！");
				break;
			}

		}

	}

}
