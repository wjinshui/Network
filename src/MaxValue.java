import java.util.Arrays;
import java.util.Random;

public class MaxValue
{

	public static void main(String[] args)
	{
		Random random = new Random();
		double[] scores = new double[100];
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = random.nextInt(101);
		}
		
		double max = scores[0];
		double sum = 0;
		for (int i = 0; i < scores.length; i++)
		{
			if( scores[i] > max)
				max = scores[i];
			sum += scores[i];
		}
		System.out.println(max);
		System.out.println("avg: " + sum / scores.length);
		
		// sort 1
		Arrays.sort(scores);
		
		// sort 2
		for (int i = 0; i < scores.length -1; i++)
		{
			for (int j = i+1; j < scores.length; j++)
			{
				if(scores[i] > scores[j])
				{
					double t = scores[i];
					scores[i] = scores[j];
					scores[j] = t;
				}
			}
		}
		
		
		
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		


	}

}
