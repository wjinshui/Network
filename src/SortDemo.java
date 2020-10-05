import java.util.Arrays;
import java.util.Random;

public class SortDemo
{

	public static void main(String[] args)
	{
		int length = 1000;
		int[] array = new int[length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(101);
		}
		for (int i = 0; i < array.length ; i++)
		{
			for(int j= i+1; j< array.length; j++  )
				if(array[i] > array[j])
				{					
					array[i] = array[j];
					array[j] = array[i];				
				}
		}
	
		for (int i : array)
		{
			System.out.println(i);
		}

	}

}
