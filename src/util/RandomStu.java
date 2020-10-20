package util;
import java.util.ArrayList;
import java.util.Collections;

public class RandomStu
{
	ArrayList<Integer> students = new ArrayList<Integer>();
	int total = 35;
	void initial()
	{
		for (int i = 1; i <= total; i++)
		{
			students.add(i);
		}
	}
	
	private void pickPoorGuys(int count)
	{
		Collections.shuffle(students);
		for (int i = 0; i < count; i++)
		{
			System.out.print(students.get(i)+",");
		}
		
	}
	
	public static void main(String...strings )
	{
		RandomStu randomStud = new RandomStu();
		randomStud.initial();
		randomStud.pickPoorGuys(4);
	}


}
