package class14;

public class SoundCard implements PCI
{

	@Override
	public void start()
	{
		System.out.println("Make noise");

	}

	@Override
	public void stop()
	{
		System.out.println("Stop sound");

	}

}
