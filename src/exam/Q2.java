package exam;

import java.util.Scanner;

class Time
{
	int hour, minute, second;

	public Time(int hour, int minute, int second)
	{
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void dispInfo()
	{
		System.out.println(hour + ":" + minute + ":" + second);
	}
	
	public int compare(Time t)
	{
		return hour * 60 * 60 + minute * 60 + second - t.hour * 60 * 60 - t.minute * 60 - t.second;
	}
	
}

public class Q2
{

	public static void main(String[] args)
	{
		Time t1, t2;
		Scanner scanner = new Scanner(System.in);
		int hour, minute, second;
		hour = scanner.nextInt();
		minute = scanner.nextInt();
		second = scanner.nextInt();
		t1 = new Time(hour, minute, second);
		hour = scanner.nextInt();
		minute = scanner.nextInt();
		second = scanner.nextInt();
		t2 = new Time(hour, minute, second);
		if(t1.compare(t2) < 0)
			t2.dispInfo();
		else
			t1.dispInfo();
				
				

	}

}
